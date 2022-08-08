package collection_framework_basics;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_13 {
	public static void main(String[] args) {
		
		Set<Team> set = new TreeSet<Team>();
		
		set.add(new Team(8, "Bangladesh"));
		set.add(new Team(5, "England"));
		set.add(new Team(9, "Zimbabwe"));
		set.add(new Team(2, "Australia"));
		set.add(new Team(4, "South Africa"));
		set.add(new Team(1, "India"));
		set.add(new Team(9, "Sri Lanka"));
		set.add(new Team(3, "Newzealand"));
		set.add(new Team(6, "West Indies"));
		set.add(new Team(7, "Pakistan"));
		
		Display_Set<Team> disp = new Display_Set<Team>();
		disp.display2(set);
		System.out.println("--------------------------------------------");
	}
}

class Team implements Comparable<Team> {
	private int rank;
	private String name;
	
	public Team(int rank, String name) {
		this.rank = rank;
		this.name = name;
	}
	
	/*
	 * Compare based on ranking of team. If ranking of team is equal then 
	 * alphabetical order of name is considered.
	 */
	public int compareTo(Team team) {
		int rank1 = this.rank;
		int rank2 = team.rank;
		String name1 = this.name;
		String name2 = team.name;
		
		if(rank1 < rank2) {
			return -1;
		} else if(rank1 == rank2) {
			int len1 = name1.length();
			int len2 = name2.length();
			
			int min = len1 < len2 ? len1 : len2;
			
			for(int i = 0; i < min; i++) {
				if((int)name1.charAt(i) - (int)name2.charAt(i) != 0) {
					return (int)name1.charAt(i) - (int)name2.charAt(i);
				}
			}
			
			if(len1 < len2) {
				return -1;
			} else if(len1 == len2) {
				return 0;
			}
			else {
				return 1;
			}
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return "Team [Rank: "+rank+", Name: "+name+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rank;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}
}