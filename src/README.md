Hw1
- Зачем нужны setter() and getter()?(eng)(https://overcoder.net/q/1852/%D0%B7%D0%B0%D1%87%D0%B5%D0%BC-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D1%8C-%D0%B3%D0%B5%D1%82%D1%82%D0%B5%D1%80%D1%8B-%D0%B8-%D1%81%D0%B5%D1%82%D1%82%D0%B5%D1%80%D1%8B-%D1%81%D1%80%D0%B5%D0%B4%D1%81%D1%82%D0%B2%D0%B0-%D0%B4%D0%BE%D1%81%D1%82%D1%83%D0%BF%D0%B0)
The get () and set () methods are needed not only to access the data, 
but also to prevent incorrect work with them.
We use getters and setters:
for reuse to carry out checks in subsequent programming steps
Getter and setter methods are public interfaces for accessing private members of a class.
The encapsulation mandate is to make the fields private and public.
Getter Methods: We can access private variables.
Setter Methods: We can change private fields.

-	Какая разница между protected и default package?(https://javarush.ru/groups/posts/1988-modifikatorih-dostupa-private-protected-default-public) 
    In fact, default = protected inheritance :)

Its use is limited, as is the protected modifier. Most often, 
default access is used in a package where there are some 
utility classes that do not 
implement the functionality of all other classes in this package.
     Fields and methods designated with the protected access modifier 
will be visible:
within all classes that are in the same package as ours;
within all inheriting classes of our class. field.

-	Создать interface shape и классы квадрат круг и 
треугольник которые имплементируют его. 
В интерфейсе обявить метод getArea(); , 
а в классах реализовать его.(https://github.com/oleksandrzakharchuk/calculating-the-area-of-shapes.git)

-	В чем разница между интерфейсом и абстрактным классом?(https://javarush.ru/quests/lectures/questsyntaxpro.level17.lecture06)
   An abstract class is a class that does not have one or 
   more methods implemented (some languages require such 
   methods to be marked with special keywords). 
   An interface is an abstract class with no 
   methods implemented, all of them are 
   public and there are no class variables.
   
Interface is a child of Abstraction and Polymorphism.
   The interface is very similar to an abstract class,
   in which all methods are abstract.
   It is declared the same as the class,
   only the interface keyword is used.
   Instead of the word class, we write interface.
   Contains only abstract methods (the word abstract does not need to be written)
   In fact, all methods of interfaces are public.
   
   An interface can only be inherited from interfaces.
   But the interface can have many parents. They also say
   that Java has multiple inheritance of interfaces.
   A class can inherit from multiple interfaces (and only from one class).
   This uses the implements keyword.
   And most importantly: you cannot declare variables in interfaces (although you can static ones).