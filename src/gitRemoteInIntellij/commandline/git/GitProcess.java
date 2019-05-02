package gitRemoteInIntellij.commandline.git;

import gitRemoteInIntellij.commandline.ssh.*;

public class GitProcess {

    void readGitConfig() {
    }

    void determineProtocol() {
    }

    void executeOperation() {
        new HTTPConnection();
        new SSHConnection();

        }

}
