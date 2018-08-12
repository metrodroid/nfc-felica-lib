/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kazzz.felica.command;

import net.kazzz.felica.FeliCaLib.PMm;

import java.util.Arrays;

/**
 * Pollingコマンドのレスポンスを抽象化したクラスを提供します
 *
 * @author Kazzz
 * @date 2011/01/22
 * @since Android API Level 9
 */

public class PollingResponse extends CommandResponse {
    final PMm pmm;
    final byte[] requestData;

    /**
     * コンストラクタ
     *
     * @param response コマンド実行結果で戻ったバイト列をセット
     */
    public PollingResponse(CommandResponse response) {
        super(response);
        if (this.data != null && this.data.length >= 8) {
            this.pmm = new PMm(Arrays.copyOfRange(this.data, 0, 8));
            this.requestData = Arrays.copyOfRange(this.data, 8, data.length);
        } else {
            this.pmm = null;
            this.requestData = null;
        }
    }

    /**
     * PMmを取得します
     *
     * @return PMm pmmが戻ります
     */
    public PMm getPMm() {
        return this.pmm;
    }
}
