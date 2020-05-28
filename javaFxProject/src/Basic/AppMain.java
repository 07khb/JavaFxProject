package Basic;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread().getName() + " : AppMain() 실행."); 
	}    //Thread.currentThread() => 현재 실행되는 Thread정보를 볼 수 있음
	
	@Override
	public void init() throws Exception { //init Override 하기 
		System.out.println(Thread.currentThread().getName() + " : init() 실행."); 
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(Thread.currentThread().getName() + " : start() 실행."); 
		VBox root = new VBox();// =>레이아웃(컨테이너)
		root.setPrefWidth(350); //넓이
		root.setPrefHeight(150); //높이
		root.setAlignment(Pos.CENTER); //가운데 정렬
		root.setSpacing(20); //간격
		
		Label label = new Label(); //javafx로 import할것  => 컨트롤
		label.setText("Hello, JavaFX"); //내용 입력하기
		label.setFont(new Font(50)); //폰트크기 지정, 컨트롤 설정은 컨트롤 밑에서 해야함.
		
		Button button = new Button(); //javafx로 import할것  => 컨트롤
		button.setText("확인");
		button.setOnAction( event -> Platform.exit()); //람다표현식사용
//				new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				Platform.exit(); //종료버튼
		
//			}
//		}); //확인을 누르면 상황(이벤트)발생 
		
		
		
		root.getChildren().add(label); //컨트롤들을 label 컨테이너에 담게해줌.
		root.getChildren().add(button); //컨트롤들을 button 컨테이너에 담게해줌.
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene); //stage에 setScene를 사용하여 scene를 붙임.
		primaryStage.show(); //윈도우(stage) 화면띄어줌

	}//윈도우(stage)에 Scene(장면)을 담고 Parent(루트컨테이너) 안에 UI컨트롤을 담음
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : stop() 실행."); 
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	// 실행순서 AppMain -> init -> start -> stop
}
