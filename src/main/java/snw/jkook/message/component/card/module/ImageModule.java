/*
 * Copyright 2022 JKook contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package snw.jkook.message.component.card.module;

import snw.jkook.entity.abilities.Accessory;

/**
 * Represents the module that contains an image file.
 */
public class ImageModule extends BaseModule implements Accessory {
    private final String src;
    private final Mode mode;

    public ImageModule(String src, Mode mode) {
        this.src = src;
        this.mode = mode;
    }

    /**
     * Get the source URL of the image file.
     */
    public String getSource() {
        return src;
    }

    @Override
    public Mode getMode() {
        return mode;
    }
}
