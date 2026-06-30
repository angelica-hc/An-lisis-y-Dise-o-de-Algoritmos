#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "cantidad de tipos de monedas:";
    cin >> n;

    int monedas[100];

    cout << "indicar las mooonedas:" << endl;

    for (int i = 0; i < n; i++)
    {
        cin >> monedas[i];
    }

    int cantidad;
    cout << "indicar la cantidad objetivo:";
    cin >> cantidad;

    int dp[100];
    int usado[100];

    for (int i = 0; i <= cantidad; i++)
    {
        dp[i] = 9999;
        usado[i] = -1;
    }

    dp[0] = 0;

    for (int i = 1; i <= cantidad; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i >= monedas[j])
            {
                if (dp[i - monedas[j]] + 1 < dp[i])
                {
                    dp[i] = dp[i - monedas[j]] + 1;
                    usado[i] = monedas[j];
                }
            }
        }
    }

    // CORREGIDO
    if (dp[cantidad] == 9999)
    {
        cout << "\nNo existe una combinacion " << endl;
        return 0;
    }

    cout << "\ncantidad minima de monedas: " << dp[cantidad] << endl;
    cout << "combinacion utilizada: ";

    int aux = cantidad;
    bool primero = true;

    while (aux > 0)
    {
        if (!primero)
            cout << " + ";

        cout << usado[aux];
        aux = aux - usado[aux];
        primero = false;
    }

    cout << endl;
    cout << "\ntabla dp:" << endl;
    cout << "[";

    for (int i = 0; i <= cantidad; i++)
    {
        // CORREGIDO
        if (dp[i] == 9999)
            cout << "inf";
        else
            cout << dp[i];

        if (i != cantidad)
            cout << ", ";
    }

    cout << "]" << endl;

    return 0;
}
