package methodOverLoading;

public class calculate {

	public boolean prime(int n)
	{
		if(n==1)
			return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
}