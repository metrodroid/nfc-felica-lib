package net.kazzz.felica.command;

import net.kazzz.felica.FeliCaLib;

import java.util.Arrays;

/**
 * FeliCa コマンドレスポンスクラスを提供します
 *
 * @author Kazz
 * @since Android API Level 9
 */
public class CommandResponse {
    protected final byte[] rawData;
    protected final int length;      //全体のデータ長 (FeliCaには無い)
    protected final byte responseCode;//コマンドレスポンスコード)
    protected final FeliCaLib.IDm idm;          //FeliCa IDm
    protected final byte[] data;      //コマンドデータ

    /**
     * コンストラクタ
     *
     * @param response 他のレスポンスをセット
     */
    public CommandResponse(CommandResponse response) {
        this(response != null ? response.getBytes() : null);
    }

    /**
     * コンストラクタ
     *
     * @param data コマンド実行結果で戻ったバイト列をセット
     */
    public CommandResponse(byte[] data) {
        if (data != null) {
            this.rawData = data;
            this.length = data[0] & 0xff;
            this.responseCode = data[1];
            this.idm = new FeliCaLib.IDm(Arrays.copyOfRange(data, 2, 10));
            this.data = Arrays.copyOfRange(data, 10, data.length);
        } else {
            this.rawData = null;
            this.length = 0;
            this.responseCode = 0;
            this.idm = null;
            this.data = null;
        }
    }

    public FeliCaLib.IDm getIDm() {
        return this.idm;
    }

    /**
     * バイト列表現を戻します
     *
     * @return byte[] このデータのバイト列表現を戻します
     */
    public byte[] getBytes() {
        return this.rawData;
    }

    public byte[] getData() {
        return data;
    }
}
