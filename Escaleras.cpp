#include <iostream>
using namespace std;
int main () {
  int n;
cout <<"indicar numero de escalones:";
cin>> n;
long long dp[100];
dp[0]=1;
if(n>=1)
  dp[1]=1;
for(int i=2;i<=n; i++){
  dp [i]=dp[i-1]+dp[i-2];
}
}

