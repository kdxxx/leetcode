DVD[] dvdCollection = new DVD[15];

DVD avengerDVD = new DVD("the avengers", 2012,"Joss Whedon");
dvdCollection[7]= avengerDVD;

System.out.println(dvdCollection[7]);


public class DVD{
  public String name;
  public int releaseYear;
  public String director;
  
  public DVD(String name, int releaseYear, String director){
    this.name=name;
    this.releaseYear=releaseYear;
    this.director=director;
  }
  
  public String toString(){
    return this.name + ", directed by " + this.director + " released in " + this.releaseyear;
  }
}
