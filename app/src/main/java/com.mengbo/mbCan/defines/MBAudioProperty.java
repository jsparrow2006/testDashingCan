package com.mengbo.mbCan.defines;

/* loaded from: classes.dex */
public enum MBAudioProperty {
    eAUDIO_PROPERTY_SOURCE(1),
    eAUDIO_PROPERTY_VOLUME(2),
    eAUDIO_PROPERTY_BALANCE_BALANCE(3),
    eAUDIO_PROPERTY_BALANCE_FADER(4),
    eAUDIO_PROPERTY_EQBAND_BASS(5),
    eAUDIO_PROPERTY_EQBAND_MIDDLE(6),
    eAUDIO_PROPERTY_EQBAND_TREBLE(7),
    eAUDIO_PROPERTY_SOFTMUTE(8),
    eAUDIO_PROPERTY_AMPMUTE(9),
    eAUDIO_PROPERTY_EQMODE(10),
    eAUDIO_PROPERTY_VOLUME_RADAS(11),
    eAUDIO_PROPERTY_VOLUME_INSTRCUMENT(12),
    eAUDIO_PROPERTY_VOLUME_SPEED(13),
    eAUDIO_PROPERTY_MIX(14),
    eVEHICLE_PROPERTY_XFMIC_MODE(15),
    eAUDIO_PROPERTY_LOUNDNESS_MODE(16),
    eAUDIO_PROPERTY_VOLUME_KEY(17),
    eAUDIO_PROPERTY_VOLUME_PHONE(18),
    eAUDIO_PROPERTY_VOLUME_NAVI(19),
    eAUDIO_PROPERTY_VOLUME_VOICE(20),
    eAUDIO_PROPERTY_ACOUSTIC_FIELD_MODE(21),
    eAUDIO_PROPERTY_SOUNDWAVE_MODE(22),
    eAUDIO_PROPERTY_SURROUND(23),
    eAUDIO_PROPERTY_ACOUSTIC_MODE(24),
    eAUDIO_PROPERTY_LOUDNESS(25),
    eAUDIO_PROPERTY_RESET(26),
    eAUDIO_PROPERTY_MUSICLOUDNESS_120HZ(27),
    eAUDIO_PROPERTY_MUSICLOUDNESS_250HZ(28),
    eAUDIO_PROPERTY_MUSICLOUDNESS_500HZ(29),
    eAUDIO_PROPERTY_MUSICLOUDNESS_1000HZ(30),
    eAUDIO_PROPERTY_MUSICLOUDNESS_2000HZ(31),
    eAUDIO_PROPERTY_MUSICLOUDNESS_6000HZ(32),
    eAUDIO_PROPERTY_MUSICLOUDNESS_1500HZ(33),
    eAUDIO_PROPERTY_DEFAULT_MAX_VOLUME(34),
    eAUDIO_PROPERTY_FACTORY(35),
    eAUDIO_PROPERTY_VOLUME_BCALL(36),
    eAUDIO_AUDIO_HEADREST_SPEAKER(37),
    eAUDIO_PROPERTY_COUNT(38);

    private int value;

    MBAudioProperty(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static String getDescription(int i) {
        for (MBAudioProperty mBAudioProperty : values()) {
            if (mBAudioProperty.value == i) {
                return mBAudioProperty.name();
            }
        }
        return "unknown";
    }

    public static int getValueByName(String str) {
        for (MBAudioProperty mBAudioProperty : values()) {
            if (mBAudioProperty.name().equals(str)) {
                return mBAudioProperty.value;
            }
        }
        return -99;
    }
}
