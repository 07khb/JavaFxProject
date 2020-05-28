package fxml;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();	                            //root 컨테이너 생성 HBox는 옆으로 길쭉한 박스
		root.setPadding(new Insets(10,10,10,10));					//안쪽 여백 설정
		root.setSpacing(10);								//컨트롤 간의 수평 간격 설정
		
		TextField textField = new TextField();				//TextField 컨트롤 생성
		textField.setPrefWidth(200);						//TextField 폭 설정
		
		Button button = new Button();						//Button 컨트롤 생성
		button.setText("확인");								//Button 글자(내용) 설정
		
		ObservableList list = root.getChildren();			//root의 ObservableList 얻기(컨트롤 컨테이너에 담는작업)
		list.add(textField);								//TextField 컨트롤 배치
		list.add(button);									//Button 컨트롤 배치
		// = root.getChildren().add(button);
		
		Scene scene = new Scene(root);						//장면생성
		
		primaryStage.setTitle("레이아웃");					//윈도우 창 제목 설정
		primaryStage.setScene(scene);						//윈도우 창에 장면 설정
		primaryStage.show();								//운도우 창 보여주기
	}
		
		public static void main(String[] args) {
			launch(args);
		}
}
