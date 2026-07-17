int factorial(int n) {
    // code here
    int ans = 1;
    
    while(n !=0){
        ans = ans * n;
        n--;
    }
    return ans;
}

