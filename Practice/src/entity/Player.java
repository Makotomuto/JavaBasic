package entity;

public class Player {
	String position;
	String name;
	String country;
	String team;

	public String getPosition(){
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry(){
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam(){
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String toString() {
		return this.position+","+this.name+","+this.country+","+this.team;

	}

}
