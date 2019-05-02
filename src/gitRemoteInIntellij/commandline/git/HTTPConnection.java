package gitRemoteInIntellij.commandline.git;

import gitRemoteInIntellij.intellij.GitAskpassApp;

/**
 * When HTTPConnection/HTTPs is used, GitProtocol handles transport on its own.
 *
 * https://git-scm.com/docs/gitcredentials#_requesting_credentials
 */
public class HTTPConnection {

    public HTTPConnection() {
        new GitCredentialHelper();
        new GitAskpassApp();
    }
}
