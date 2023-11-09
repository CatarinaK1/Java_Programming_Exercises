package OOP;

//=======================  Cat.java  ===============================


class Cat extends Mammal {

  private String color;
  private int legs;

  public Cat(String color, int legs, double weight) {
      super(weight);
      this.color = color;
      this.legs = legs;
  }

  /**
   * Get the value of jalkoja
   *
   * @return the value of jalkoja
   */

  public int getLegs() {
      return legs;
  }

  /**
   * Set the value of jalkoja
   *
   * @param jalkoja new value of jalkoja
   */

  public void setLegs(int legs) {
      this.legs = legs;
  }

  /**
   * Get the value of vari
   *
   * @return the value of vari
   */

  public String getColor() {
      return color;
  }

  /**
   * Set the value of vari
   *
   * @param vari new value of vari
   */

  public void setColor(String color) {
      this.color = color;
  }

  @Override
  public void eat() {
      System.out.println("I am eating like a Cat");
  }

  @Override
  public boolean isBig() {
      if(getWeight()>10) {
          return true;
      }
      return false;
  }

}