package OOP;

 class opiskelija extends human {

	private String course;

	public opiskelija(String eyeColor, int age, double weight, String native_language, String course) {
		super(eyeColor, age, weight, native_language);
		this.course = course;
		
		//constructors are a must review
		
		

	}
	public String getCourse() {
		return course;
	}

}
