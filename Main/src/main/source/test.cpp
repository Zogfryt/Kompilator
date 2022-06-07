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

int main() {

Object* string = new String("Hehe");
Object* joinedString = new String(std::string(std::string("Hoho")+std::string(string))+std::string("Hihi"));

delete string;
delete joinedString;

return 0;
}
