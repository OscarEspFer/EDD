#include "MEUCALC.h"
#include <stdio.h>
int main () {

int op1,op2,s,r,m,d,ma;
printf("Introdueix L'operador 1\n");
scanf("%d",&op1);
printf("Introdueix L'operador 2\n");
scanf("%d",&op2);
s=suma(op1,op2);
r=resta(op1,op2);
m=multiplica(op1,op2);
d=divideix(op1,op2);
ma=major(op1,op2);

if (ma == 1) { ma = op1; }
else {ma = op2;}

printf("La suma es %d\nLa resta es %d\nLa multiplicacio es %d\nLa divisio es %d\nEl nombre major es%d\n",s,r,m,d,ma);

}
