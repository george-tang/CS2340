package frontpage.backend.report;

import frontpage.bind.errorhandling.BackendRequestException;
import frontpage.bind.report.SourceReportManager;

import java.util.Map;

/**
 * @author willstuckey
 * <p></p>
 */
public class LocalSourceReportManager implements SourceReportManager {
    @Override
    public String addSourceReport(final String email,
                                  final String tok)
            throws BackendRequestException {
        return null;
    }

    @Override
    public boolean updateSourceReport(final String email,
                                      final String tok,
                                      final String id,
                                      final Map<String, String> properties)
            throws BackendRequestException {
        return false;
    }

    @Override
    public Map<String, String> getSourceReport(final String id)
            throws BackendRequestException {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, String>[] getSourceReports(final int num)
            throws BackendRequestException {
        return (Map<String, String>[]) new Map[0];
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<String, String>[] getSourceReports(
            final Map<String, String> properties,
            final Map<String, String> searchConstraints)
            throws BackendRequestException {
        return (Map<String, String>[]) new Map[0];
    }

    @Override
    public void deleteSourceReport(final String email,
                                   final String tok,
                                   final String id)
            throws BackendRequestException {

    }

    @SuppressWarnings({"UnnecessaryReturnStatement", "EmptyMethod"})
    @Override
    public void __deleteSourceReport_fs_na(final String email,
                                           final String tok,
                                           final String id) {
        return;
    }
}
