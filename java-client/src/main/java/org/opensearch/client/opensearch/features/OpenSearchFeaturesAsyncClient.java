/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.opensearch.features;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.opensearch.client.ApiClient;
import org.opensearch.client.opensearch._types.OpenSearchException;
import org.opensearch.client.transport.OpenSearchTransport;
import org.opensearch.client.transport.TransportOptions;

/**
 * Client for the features namespace.
 */
public class OpenSearchFeaturesAsyncClient extends ApiClient<OpenSearchTransport, OpenSearchFeaturesAsyncClient> {

    public OpenSearchFeaturesAsyncClient(OpenSearchTransport transport) {
        super(transport, null);
    }

    public OpenSearchFeaturesAsyncClient(OpenSearchTransport transport, @Nullable TransportOptions transportOptions) {
        super(transport, transportOptions);
    }

    @Override
    public OpenSearchFeaturesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
        return new OpenSearchFeaturesAsyncClient(this.transport, transportOptions);
    }

    // ----- Endpoint: features.get_features

    /**
     * Gets a list of features which can be included in snapshots using the
     * feature_states field when creating a snapshot
     *
     *
     */
    public CompletableFuture<GetFeaturesResponse> getFeatures() throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(GetFeaturesRequest._INSTANCE, GetFeaturesRequest._ENDPOINT, this.transportOptions);
    }

    // ----- Endpoint: features.reset_features

    /**
     * Resets the internal state of features, usually by deleting system indices
     *
     *
     */
    public CompletableFuture<ResetFeaturesResponse> resetFeatures() throws IOException, OpenSearchException {
        return this.transport.performRequestAsync(ResetFeaturesRequest._INSTANCE, ResetFeaturesRequest._ENDPOINT, this.transportOptions);
    }

}
