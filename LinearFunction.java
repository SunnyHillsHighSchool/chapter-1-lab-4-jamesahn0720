public class LinearFunction implements LinearFunctionMethods
{
  private double slope;
  private double yint;

  public LinearFunction(double m, double b)
  {
    slope = m;
    yint = b;
  }

  public double getSlope()
  {
    return slope;
  }

  public double getYintercept()
  {
    return yint;
  }

  public double getRoot()
  {
    return (-1*yint)/slope;
  }

  public double getYvalue(double x)
  {
    return slope*x+yint;
  }

  public double getXvalue(double y)
  {
    return (y-yint)/slope;
  }

}
