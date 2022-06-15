#include <string>

class Object{};

class Integer: public Object
{
public:
    int value;
    explicit Integer(int val) : value(val){};
};

class Double: public Object
{
public:
    double value;
    explicit Double(double val) : value(val){};
};

class String: public Object
{
public:
    std::string value;
    explicit String(std::string val) : value(val){};
};

class Boolean: public Object
{
public:
    bool value;
    explicit Boolean(bool val) : value(val){};
};

double doubleBuffer;

int main() {



return 0;
}
