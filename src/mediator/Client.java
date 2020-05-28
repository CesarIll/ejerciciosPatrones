package mediator;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Skype skype = new Skype();

        Developer dev1 = new Developer(skype, "Juan1");
        Developer dev2 = new Developer(skype, "Juan2");
        Developer dev3 = new Developer(skype, "Juan3");
        Developer dev4 = new Developer(skype, "Juan4");
        Developer dev5 = new Developer(skype, "Juan5");

        List<Developer> developerList = new LinkedList<>();
        developerList.add(dev1);
        developerList.add(dev2);
        developerList.add(dev3);
        developerList.add(dev4);
        developerList.add(dev5);

        QA qa1 = new QA(skype,"Maria1");
        QA qa2 = new QA(skype,"Maria2");
        QA qa3 = new QA(skype,"Maria3");
        QA qa4 = new QA(skype,"Maria4");
        QA qa5 = new QA(skype,"Maria5");

        List<QA> qaList = new LinkedList<>();
        qaList.add(qa1);
        qaList.add(qa2);
        qaList.add(qa3);
        qaList.add(qa4);
        qaList.add(qa5);

        ScrumMaster sm = new ScrumMaster(skype, "José");

        skype.setDeveloperList(developerList);
        skype.setQAList(qaList);
        skype.setScrumMaster(sm);

        sm.send("Desarrollen módulo M2 y verifiquen módulo M1");
        dev3.send("Desarrollando módulo M2");
        qa4.send("Verificando módulo M1");
    }
}
