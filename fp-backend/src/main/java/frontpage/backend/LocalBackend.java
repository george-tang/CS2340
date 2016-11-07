package frontpage.backend;

import frontpage.backend.profile.LocalProfileManager;
import frontpage.backend.profile.ProfileManagerFactory;
import frontpage.backend.user.LocalUserManager;
import frontpage.backend.user.UserManagerFactory;
import frontpage.bind.Backend;
import frontpage.bind.report.PurityReportManager;
import frontpage.bind.report.SourceReportManager;
import frontpage.bind.user.UserManager;
import frontpage.bind.errorhandling.ProfileManagementException;
import frontpage.bind.profile.ProfileManager;
import org.apache.log4j.Logger;

/**
 * @author willstuckey
 * <p>This class represents the api provided for a local backend.</p>
 */
public class LocalBackend implements Backend {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(LocalBackend.class);
    }

    /**
     * backend provided user authenticator
     */
    protected UserManager userManager;

    /**
     * initializes the local backend
     */
    public LocalBackend() {
        try {
            logger.info("initializing local user authenticator");
            UserManagerFactory.createInstance("local");
            ProfileManagerFactory.createInstance("local");
        } catch (UserManagerFactory.NoSuchUserAuthenticatorException
                | ProfileManagementException e) {
            logger.fatal("could not provide backend", e);
        }
    }

    public UserManager getUserManager() {
        return UserManagerFactory.getInstance();
    }

    public ProfileManager getProfileManager() {
        LocalProfileManager.setLum(
                (LocalUserManager) UserManagerFactory.getInstance());
        return ProfileManagerFactory.getInstance();
    }

    public SourceReportManager getSourceReportManager() {
        return null;
    }

    public PurityReportManager getPurityReportManager() {
        return null;
    }
}
