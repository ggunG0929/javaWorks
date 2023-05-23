package arraylist.scorelist;

public class Subject {
	// 과목 클래스 정의
	private String subjectName;		// 과목이름
	private int scorePoint;			// 점수
	
	// 생성자 생략
	
	// get(), set()
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	public int getScorePoint() {
		return scorePoint;
	}

}
