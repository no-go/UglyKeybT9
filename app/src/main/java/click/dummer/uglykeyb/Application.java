package click.dummer.uglykeyb;

public final class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "DEFAULT", "fonts/c64pro_mono.ttf");
    }
}