#include <stdio.h>

/* pint Fahrenheit-Celsius tbale for
    fahr = 0, 20, 40, ..., 300 */
main()
{
  float fahr, celsius;
  int lower, upper, step;
  lower = 0;
  upper = 300;
  step = 20;
  
  fahr = lower;
  while (fahr <= 300) {
    celsius = 5.0 * (fahr - 32.0) / 9.0;
    printf("%3.0f\t%0.1f\n", fahr, celsius);
    fahr = fahr + step;
  }
}
