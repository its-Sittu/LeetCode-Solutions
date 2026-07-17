int factorial(int n) {
    // code here
    int ans = 1;
    
    while(n !=0){
        ans = ans * n;
        n--;
    }
    return ans;
}


//Optimise Code by Recursion

int factorial(int n) {
    // code here
    
    if(n == 0 || n == 1){
        return 1;
    }
    
    
    int ans = n*factorial(n-1);
    
    return ans;
    
    
}
