package gitRemoteInIntellij.env;

import gitRemoteInIntellij.commandline.ssh.OpenSSHClient;
import gitRemoteInIntellij.intellij.BuiltInSSH;

public class GIT_SSH {

    public static String EnvironmentVar;

    public GIT_SSH() {
        new OpenSSHClient();
        new BuiltInSSH();

    }
}
