/** Accessor Method for name */
  public String getName() {
    return name;
  }
  
  /** Accessor Method for age */
  public String getBirthday() {
    return birthday;
  }
  
   public String getSport() {
    return sport;
     
  } public String getMedal() {
    return medal;
  }
  /** toString Method override */
  public String toString() {
    return name + " (" + birthday + ") " + medal + " (" + sport + ")";
  }
   //to string displaying olympian
  public String toStringName(){
    return "Name: "+ name; 
  }
  //to string displaying birthday
  public String toStringBirthday(){
    return "Birthday: " + birthday;
  }
  //to string displaying medal
  public String toStringMedal(){
    return "Medal: " + medal;
  }
  //to string displaying sport 
  public String toStringSport(){
    return "Sport: " + sport;
  }
}
