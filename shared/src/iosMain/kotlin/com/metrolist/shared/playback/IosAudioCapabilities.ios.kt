package com.metrolist.shared.playback

import platform.Foundation.NSProcessInfo

private const val IOS_OPUS_MP4_MINIMUM_MAJOR_VERSION = 17L

internal fun supportsIosOpusMp4Playback(): Boolean =
    NSProcessInfo.processInfo.operatingSystemVersion.majorVersion >= IOS_OPUS_MP4_MINIMUM_MAJOR_VERSION
