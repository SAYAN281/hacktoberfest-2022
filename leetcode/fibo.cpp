#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a = 0;
    int b = 1;
    int c = 0;
    int n;
    cin >> n;
    cout << a << " " << b << " ";
    while (c < n)
    {
        c = a + b;
        a = b;
        b = c;
        cout << c << " ";
    }
}