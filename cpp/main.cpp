#include <iostream>
#include <algorithm>

using namespace std;

// Function literal
auto charFuncLit = [](char &c){ c = ::tolower(c); };

// Function literal with an array traversing technique
auto strFuncLit = [](string &url){ for_each(begin(url), end(url), charFuncLit); cout<< url <<" ";};

int main()
{
    string urlArray[] = { "HTTPS://GOLANG.ORG",
                          "HTTPS://SCALA-LANG.ORG",
                          "HTTPS://JAVA.COM",
                          "HTTPS://PYTHON.ORG",
                          "HTTPS://ISOCPP.ORG" };

    // Array traversing technique
    for_each(begin(urlArray), end(urlArray), strFuncLit);

    return 0;
}