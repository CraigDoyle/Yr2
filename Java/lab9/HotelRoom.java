class HotelRoom
{
  private int roomNumber;
  private String roomType;
  private double rate=0;
  private int occupied;
  
	public HotelRoom ()							//constructor
	{
	
	}
	
	public HotelRoom(String type, int number, double cost, int occupied)
	{
		roomType = type;
		roomNumber = number;
		this.rate = cost;
		this.occupied = occupied;
	}

	public void setNumber(int number)			//setter
	{
		roomNumber = number;
	}
	
	public void setType(String type)
	{
		roomType = type;
	}
	
	public void setOccupied(int occupied)
	{
		occupied=0;
	}
		public boolean isOccupied()
		{
			if(occupied==1)
			{
				return true;
			}
			return false;
		}
	public void setCost(double cost)
	{
		cost=rate;
	}
	
	
	public int getNumber()						//getter
	{
		return roomNumber;
	}
	
	public String getType()
	{
		return roomType;
	}
	
	public int getOccupied()
	{
		return occupied;
	}
	
	public double getCost()
	{
		return rate;
	}

}

