package edu.kis.powp.jobs2d.drivers.command;

public class FigureFactory {
    static public ComplexCommand square (){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(0,0));
        command.addCommand(new OperateToCommand(0,50));
        command.addCommand(new OperateToCommand(50,50));
        command.addCommand(new OperateToCommand(50,0));
        command.addCommand(new OperateToCommand(0,0));
        return command;
    }

    static public ComplexCommand triangle (){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(0,0));
        command.addCommand(new OperateToCommand(50,50));
        command.addCommand(new OperateToCommand(50,0));
        command.addCommand(new OperateToCommand(0,0));
        return command;
    }

}