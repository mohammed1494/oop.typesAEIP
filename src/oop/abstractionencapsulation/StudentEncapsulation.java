package oop.abstractionencapsulation;

public class StudentEncapsulation {
	
		
		private String stName;
		private int stId;
		private char stGrade;
		private String stDOB;
		
		//private is hiding (encapsulation) data must make it public
		
		public StudentEncapsulation() {}
		
		public StudentEncapsulation(String stName, int stId, char stGrade, String stDOB) {
			this.stName = stName;
			this.stId = stId;
			this.stGrade = stGrade;
			this.stDOB = stDOB;
		} 
		
		public String getStName() {
			return stName;
		}

		public void setStName(String stName) {
			this.stName = stName;
		}

		public int getStId() {
			return stId;
		}

		public void setStId(int stId) {
			this.stId = stId;
		}

		public char getStGrade() {
			return stGrade;
		}

		public void setStGrade(char stGrade) {
			this.stGrade = stGrade;
		}

		public String getStDOB() {
			return stDOB;
		}

		public void setStDOB(String stDOB) {
			this.stDOB = stDOB;
	}

}	
	
