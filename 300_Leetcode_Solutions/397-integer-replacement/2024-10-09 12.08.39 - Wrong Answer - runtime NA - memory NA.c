int integerReplacement(int n){
int count= 0; int k;
int s=n;
while(s>1)
{
if((s%2)==0)
{
s = s/2;
}
else if(s%2==1)
{
s = s-1;
}
else
{
s+=1;
}
count++;
}
return count;
}

