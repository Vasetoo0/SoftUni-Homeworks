package OOP.LoggerLibrary.Appenders;

import OOP.LoggerLibrary.Appenders.Interfaces.Appender;
import OOP.LoggerLibrary.Enums.ReportLevel;
import OOP.LoggerLibrary.Layouts.Interfaces.Layout;

public abstract class AppenderImpl implements Appender {

    private Layout layout;
    private ReportLevel reportLevel;
    private int loggedMessages;

    protected AppenderImpl(Layout layout) {
        this.layout = layout;
        this.setReportLevel(ReportLevel.INFO);
        this.loggedMessages = 0;
    }

    protected AppenderImpl(Layout layout, ReportLevel reportLevel) {
        this(layout);
        this.setReportLevel(reportLevel);
    }

    @Override
    public ReportLevel getReportLevel(){
        return this.reportLevel;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    protected String format(String date, ReportLevel reportLevel, String message) {
        this.loggedMessages++;
        return this.layout.format(date,reportLevel,message);
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(),
                this.layout.getClass().getSimpleName(),
                this.reportLevel.toString(),
                this.loggedMessages);
    }
}
