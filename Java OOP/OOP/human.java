package OOP;

class human extends Mammal {
	
	

	private String eyeColor;

	private int age;

	private String native_language;

	public human(String eyeColor, int age, double weight, String native_language) {
		super(weight);
		this.native_language = native_language;
		this.eyeColor = eyeColor;
		this.age = age;
	}

	/**
	 * Get the value of age
	 *
	 * @return the value of jage
	 */

	public int getAge() {
		return age;
	}

	
	public String getLanguage() {
		return native_language;
	}

	/**
	 * Set the value of age
	 *
	 * @param age new value of age
	 */

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Get the value of vari
	 *
	 * @return the value of vari
	 */

	public String getColor() {
		return eyeColor;
	}

	/**
	 * Set the value of vari
	 *
	 * @param vari new value of vari
	 */

	public void setColor(String color) {
		this.eyeColor = eyeColor;
	}

	@Override
	public void eat() {
		System.out.println("I am eating like a Cat");
	}

	@Override
	public boolean isBig() {
		if (getWeight() > 10) {
			return true;
		}
		return false;
	}

	public boolean isSmall() {
		if (getWeight() < 60) {
			return true;
		}
		return false;
	}
}
