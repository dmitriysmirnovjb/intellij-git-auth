package gitRemoteInIntellij.commandline.ssh;

import gitRemoteInIntellij.env.GIT_SSH;

/**
 * When SSH access is used, Git relies on SSH client to handle transport and authentication.
 * To do so
 */
public class SSHConnection {

    public SSHConnection() {

        if (GIT_SSH.VALUE.isEmpty()) {

        }

    }

    public void executeSSHCommand() {

    }

}
