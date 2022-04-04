// your solution here
//fix all the errors including package errors
package ru.innopolis.problem1;

class Workshop{
    private Operation operation;
    public void operate(){
        operation.operate();
    }
    public void setOperation(Operation op){
        operation = op;
    }
}
interface Operation{
    void operate();
}
class AssembleCar implements Operation{

    @Override
    public void operate() {

    }
}
class DisassempleCar implements Operation{

    @Override
    public void operate() {

    }
}