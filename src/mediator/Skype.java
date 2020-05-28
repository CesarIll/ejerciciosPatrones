package mediator;

import java.util.List;

public class Skype implements Mediator{

    private List<Developer> developerList;
    private List<QA> QAList;
    private ScrumMaster scrumMaster;

    @Override
    public void send(String msg, Colleague colleague) {
        if (developerList.contains(colleague)) {
            for(Developer a : developerList) {
                if (a != colleague) {
                    a.receive(msg);
                }
            }
        } else if (QAList.contains(colleague)) {
            for(QA a : QAList) {
                if (a != colleague) {
                    a.receive(msg);
                }
            }
        } else {
            for(Developer a : developerList) {
                if (a != colleague) {
                    a.receive(msg);
                }
            }
            for(QA a : QAList) {
                if (a != colleague) {
                    a.receive(msg);
                }
            }
        }
    }

    public List<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(List<Developer> developerList) {
        this.developerList = developerList;
    }

    public List<QA> getQAList() {
        return QAList;
    }

    public void setQAList(List<QA> QAList) {
        this.QAList = QAList;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }
}
