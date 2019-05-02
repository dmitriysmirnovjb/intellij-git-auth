package gitRemoteInIntellij.commandline.ssh;

import gitRemoteInIntellij.env.SSH_AUTH_SOCK;
import gitRemoteInIntellij.intellij.SSHAskpassApp;

public class OpenSSHClient {

    public OpenSSHClient() {
    }

    void findSSHKey() {

    }

    void useSSHAgent() {
        !SSH_AUTH_SOCK.EnvironmentVar.isEmpty();
    }

    void askPassphraseOrPassword() {
        new SSHAskpassApp();
    }

}
