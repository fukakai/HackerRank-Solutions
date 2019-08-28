/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
class MyCalculator {
  //Making the method Throwable using Throws
  public long power(int n, int p) throws Exception{
      //preparing Throwable Exceptions
      Exception zero = new Exception("n and p should not be zero.");
      Exception negative = new Exception("n or p should not be negative.");

      //if any of theses conditions, throwing an error, and not continue until return
      if (n == 0 && p == 0) throw zero;
      if (n < 0 || p < 0) throw negative; 

      //return Long pow n^p
      return (long) Math.pow(n,p);
  }
}