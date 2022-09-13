/*

Sample Input:
589 5 9
Sample Output:
27
*/

public long longExpression(int a, int b, int c) {
    //long billion = 100000000000L;    
    //a = billion % a;
    //a = a >> b;
    //c = 100 / c;
    return ( (100000000000L % a) >> b ) | (100 / c);
    //return a + b + c;
}