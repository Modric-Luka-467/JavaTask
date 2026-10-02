public class LogisticsConfig {
    private String systemName = "顺风智能仓储系统";
    private static LogisticsConfig instance = new LogisticsConfig();
    private LogisticsConfig(){}
    public static LogisticsConfig getInstance(){
        return instance;
    }
}
