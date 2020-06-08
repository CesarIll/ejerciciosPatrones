package command;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Computadora {
    private Map<String, LocalDateTime> usuarios = new HashMap<>();
    private List<ICommand> commandList = new LinkedList<>();

    public void setCommand(ICommand command) {
        commandList.add(command);
    }

    public void executeCommands(Usuario usuario){
        for (ICommand command : commandList) {
            command.execute();
        }
        commandList.clear();
        usuarios.put(usuario.getName(), LocalDateTime.now());
    }

}
