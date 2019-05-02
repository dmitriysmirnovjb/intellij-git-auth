package gitRemoteInIntellij.env;

import gitRemoteInIntellij.commandline.ssh.SSHAgent;

public class SSH_AUTH_SOCK {

    public static String EnvironmentVar;

    public SSH_AUTH_SOCK() {
        new SSHAgent();
    }
}
