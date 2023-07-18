package mvs;

public class model {
	  private String title;
	  private String description;
	  private int prioritylevel;
	  private String completionstatus;
	  public model(String title,String description,int prioritylevel,String completionstatus)
	  {
		  this.title=title;
		  this.description=description;
		  this.prioritylevel=prioritylevel;
		  this.completionstatus=completionstatus;
	  }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrioritylevel() {
		return prioritylevel;
	}
	public void setPrioritylevel(int prioritylevel) {
		this.prioritylevel = prioritylevel;
	}
	public String getCompletionstatus() {
		return completionstatus;
	}
	public void setCompletionstatus(String completionstatus) {
		this.completionstatus = completionstatus;
	}
}
