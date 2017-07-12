@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package sfml

import konan.SymbolName
import kotlinx.cinterop.*

fun sfTime_asSeconds(time: CValue<sfTime>): Float {
    return memScoped {
        val _time = time.getPointer(memScope).rawValue
        val res = kni_sfTime_asSeconds(_time)
        res
    }
}

@SymbolName("sfml_kni_sfTime_asSeconds")
private external fun kni_sfTime_asSeconds(time: NativePtr): Float

fun sfTime_asMilliseconds(time: CValue<sfTime>): sfInt32 {
    return memScoped {
        val _time = time.getPointer(memScope).rawValue
        val res = kni_sfTime_asMilliseconds(_time)
        res
    }
}

@SymbolName("sfml_kni_sfTime_asMilliseconds")
private external fun kni_sfTime_asMilliseconds(time: NativePtr): Int

fun sfTime_asMicroseconds(time: CValue<sfTime>): sfInt64 {
    return memScoped {
        val _time = time.getPointer(memScope).rawValue
        val res = kni_sfTime_asMicroseconds(_time)
        res
    }
}

@SymbolName("sfml_kni_sfTime_asMicroseconds")
private external fun kni_sfTime_asMicroseconds(time: NativePtr): Long

fun sfSeconds(amount: Float): CValue<sfTime> {
    return memScoped {
        val _amount = amount
        val res = kni_sfSeconds(_amount, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSeconds")
private external fun kni_sfSeconds(amount: Float, retValPlacement: NativePtr): NativePtr

fun sfMilliseconds(amount: sfInt32): CValue<sfTime> {
    return memScoped {
        val _amount = amount
        val res = kni_sfMilliseconds(_amount, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfMilliseconds")
private external fun kni_sfMilliseconds(amount: Int, retValPlacement: NativePtr): NativePtr

fun sfMicroseconds(amount: sfInt64): CValue<sfTime> {
    return memScoped {
        val _amount = amount
        val res = kni_sfMicroseconds(_amount, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfMicroseconds")
private external fun kni_sfMicroseconds(amount: Long, retValPlacement: NativePtr): NativePtr

fun sfClock_create(): CPointer<sfClock>? {
    val res = kni_sfClock_create()
    return interpretCPointer<sfClock>(res)
}

@SymbolName("sfml_kni_sfClock_create")
private external fun kni_sfClock_create(): NativePtr

fun sfClock_copy(clock: CValuesRef<sfClock>?): CPointer<sfClock>? {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_copy(_clock)
        interpretCPointer<sfClock>(res)
    }
}

@SymbolName("sfml_kni_sfClock_copy")
private external fun kni_sfClock_copy(clock: NativePtr): NativePtr

fun sfClock_destroy(clock: CValuesRef<sfClock>?): Unit {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_destroy(_clock)
        res
    }
}

@SymbolName("sfml_kni_sfClock_destroy")
private external fun kni_sfClock_destroy(clock: NativePtr): Unit

fun sfClock_getElapsedTime(clock: CValuesRef<sfClock>?): CValue<sfTime> {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_getElapsedTime(_clock, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfClock_getElapsedTime")
private external fun kni_sfClock_getElapsedTime(clock: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfClock_restart(clock: CValuesRef<sfClock>?): CValue<sfTime> {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_restart(_clock, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfClock_restart")
private external fun kni_sfClock_restart(clock: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfMutex_create(): CPointer<sfMutex>? {
    val res = kni_sfMutex_create()
    return interpretCPointer<sfMutex>(res)
}

@SymbolName("sfml_kni_sfMutex_create")
private external fun kni_sfMutex_create(): NativePtr

fun sfMutex_destroy(mutex: CValuesRef<sfMutex>?): Unit {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_sfMutex_destroy(_mutex)
        res
    }
}

@SymbolName("sfml_kni_sfMutex_destroy")
private external fun kni_sfMutex_destroy(mutex: NativePtr): Unit

fun sfMutex_lock(mutex: CValuesRef<sfMutex>?): Unit {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_sfMutex_lock(_mutex)
        res
    }
}

@SymbolName("sfml_kni_sfMutex_lock")
private external fun kni_sfMutex_lock(mutex: NativePtr): Unit

fun sfMutex_unlock(mutex: CValuesRef<sfMutex>?): Unit {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_sfMutex_unlock(_mutex)
        res
    }
}

@SymbolName("sfml_kni_sfMutex_unlock")
private external fun kni_sfMutex_unlock(mutex: NativePtr): Unit

fun sfSleep(duration: CValue<sfTime>): Unit {
    return memScoped {
        val _duration = duration.getPointer(memScope).rawValue
        val res = kni_sfSleep(_duration)
        res
    }
}

@SymbolName("sfml_kni_sfSleep")
private external fun kni_sfSleep(duration: NativePtr): Unit

fun sfThread_create(function: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, userData: COpaquePointer?): CPointer<sfThread>? {
    val _function = function.rawValue
    val _userData = userData.rawValue
    val res = kni_sfThread_create(_function, _userData)
    return interpretCPointer<sfThread>(res)
}

@SymbolName("sfml_kni_sfThread_create")
private external fun kni_sfThread_create(function: NativePtr, userData: NativePtr): NativePtr

fun sfThread_destroy(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_destroy(_thread)
        res
    }
}

@SymbolName("sfml_kni_sfThread_destroy")
private external fun kni_sfThread_destroy(thread: NativePtr): Unit

fun sfThread_launch(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_launch(_thread)
        res
    }
}

@SymbolName("sfml_kni_sfThread_launch")
private external fun kni_sfThread_launch(thread: NativePtr): Unit

fun sfThread_wait(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_wait(_thread)
        res
    }
}

@SymbolName("sfml_kni_sfThread_wait")
private external fun kni_sfThread_wait(thread: NativePtr): Unit

fun sfThread_terminate(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_terminate(_thread)
        res
    }
}

@SymbolName("sfml_kni_sfThread_terminate")
private external fun kni_sfThread_terminate(thread: NativePtr): Unit

fun sfListener_setGlobalVolume(volume: Float): Unit {
    val _volume = volume
    val res = kni_sfListener_setGlobalVolume(_volume)
    return res
}

@SymbolName("sfml_kni_sfListener_setGlobalVolume")
private external fun kni_sfListener_setGlobalVolume(volume: Float): Unit

fun sfListener_getGlobalVolume(): Float {
    val res = kni_sfListener_getGlobalVolume()
    return res
}

@SymbolName("sfml_kni_sfListener_getGlobalVolume")
private external fun kni_sfListener_getGlobalVolume(): Float

fun sfListener_setPosition(position: CValue<sfVector3f>): Unit {
    return memScoped {
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfListener_setPosition(_position)
        res
    }
}

@SymbolName("sfml_kni_sfListener_setPosition")
private external fun kni_sfListener_setPosition(position: NativePtr): Unit

fun sfListener_getPosition(): CValue<sfVector3f> {
    return memScoped {
        val res = kni_sfListener_getPosition(alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfListener_getPosition")
private external fun kni_sfListener_getPosition(retValPlacement: NativePtr): NativePtr

fun sfListener_setDirection(direction: CValue<sfVector3f>): Unit {
    return memScoped {
        val _direction = direction.getPointer(memScope).rawValue
        val res = kni_sfListener_setDirection(_direction)
        res
    }
}

@SymbolName("sfml_kni_sfListener_setDirection")
private external fun kni_sfListener_setDirection(direction: NativePtr): Unit

fun sfListener_getDirection(): CValue<sfVector3f> {
    return memScoped {
        val res = kni_sfListener_getDirection(alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfListener_getDirection")
private external fun kni_sfListener_getDirection(retValPlacement: NativePtr): NativePtr

fun sfListener_setUpVector(upVector: CValue<sfVector3f>): Unit {
    return memScoped {
        val _upVector = upVector.getPointer(memScope).rawValue
        val res = kni_sfListener_setUpVector(_upVector)
        res
    }
}

@SymbolName("sfml_kni_sfListener_setUpVector")
private external fun kni_sfListener_setUpVector(upVector: NativePtr): Unit

fun sfListener_getUpVector(): CValue<sfVector3f> {
    return memScoped {
        val res = kni_sfListener_getUpVector(alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfListener_getUpVector")
private external fun kni_sfListener_getUpVector(retValPlacement: NativePtr): NativePtr

fun sfMusic_createFromFile(filename: String?): CPointer<sfMusic>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfMusic_createFromFile(_filename)
        interpretCPointer<sfMusic>(res)
    }
}

@SymbolName("sfml_kni_sfMusic_createFromFile")
private external fun kni_sfMusic_createFromFile(filename: NativePtr): NativePtr

fun sfMusic_createFromMemory(data: COpaquePointer?, sizeInBytes: size_t): CPointer<sfMusic>? {
    val _data = data.rawValue
    val _sizeInBytes = sizeInBytes
    val res = kni_sfMusic_createFromMemory(_data, _sizeInBytes)
    return interpretCPointer<sfMusic>(res)
}

@SymbolName("sfml_kni_sfMusic_createFromMemory")
private external fun kni_sfMusic_createFromMemory(data: NativePtr, sizeInBytes: Long): NativePtr

fun sfMusic_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfMusic>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val res = kni_sfMusic_createFromStream(_stream)
        interpretCPointer<sfMusic>(res)
    }
}

@SymbolName("sfml_kni_sfMusic_createFromStream")
private external fun kni_sfMusic_createFromStream(stream: NativePtr): NativePtr

fun sfMusic_destroy(music: CValuesRef<sfMusic>?): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_destroy(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_destroy")
private external fun kni_sfMusic_destroy(music: NativePtr): Unit

fun sfMusic_setLoop(music: CValuesRef<sfMusic>?, loop: sfBool): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _loop = loop
        val res = kni_sfMusic_setLoop(_music, _loop)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setLoop")
private external fun kni_sfMusic_setLoop(music: NativePtr, loop: Int): Unit

fun sfMusic_getLoop(music: CValuesRef<sfMusic>?): sfBool {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getLoop(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_getLoop")
private external fun kni_sfMusic_getLoop(music: NativePtr): Int

fun sfMusic_getDuration(music: CValuesRef<sfMusic>?): CValue<sfTime> {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getDuration(_music, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfMusic_getDuration")
private external fun kni_sfMusic_getDuration(music: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfMusic_play(music: CValuesRef<sfMusic>?): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_play(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_play")
private external fun kni_sfMusic_play(music: NativePtr): Unit

fun sfMusic_pause(music: CValuesRef<sfMusic>?): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_pause(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_pause")
private external fun kni_sfMusic_pause(music: NativePtr): Unit

fun sfMusic_stop(music: CValuesRef<sfMusic>?): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_stop(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_stop")
private external fun kni_sfMusic_stop(music: NativePtr): Unit

fun sfMusic_getChannelCount(music: CValuesRef<sfMusic>?): Int {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getChannelCount(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_getChannelCount")
private external fun kni_sfMusic_getChannelCount(music: NativePtr): Int

fun sfMusic_getSampleRate(music: CValuesRef<sfMusic>?): Int {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getSampleRate(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_getSampleRate")
private external fun kni_sfMusic_getSampleRate(music: NativePtr): Int

fun sfMusic_getStatus(music: CValuesRef<sfMusic>?): sfSoundStatus {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getStatus(_music)
        sfSoundStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfMusic_getStatus")
private external fun kni_sfMusic_getStatus(music: NativePtr): Int

fun sfMusic_getPlayingOffset(music: CValuesRef<sfMusic>?): CValue<sfTime> {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getPlayingOffset(_music, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfMusic_getPlayingOffset")
private external fun kni_sfMusic_getPlayingOffset(music: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfMusic_setPitch(music: CValuesRef<sfMusic>?, pitch: Float): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _pitch = pitch
        val res = kni_sfMusic_setPitch(_music, _pitch)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setPitch")
private external fun kni_sfMusic_setPitch(music: NativePtr, pitch: Float): Unit

fun sfMusic_setVolume(music: CValuesRef<sfMusic>?, volume: Float): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _volume = volume
        val res = kni_sfMusic_setVolume(_music, _volume)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setVolume")
private external fun kni_sfMusic_setVolume(music: NativePtr, volume: Float): Unit

fun sfMusic_setPosition(music: CValuesRef<sfMusic>?, position: CValue<sfVector3f>): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfMusic_setPosition(_music, _position)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setPosition")
private external fun kni_sfMusic_setPosition(music: NativePtr, position: NativePtr): Unit

fun sfMusic_setRelativeToListener(music: CValuesRef<sfMusic>?, relative: sfBool): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _relative = relative
        val res = kni_sfMusic_setRelativeToListener(_music, _relative)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setRelativeToListener")
private external fun kni_sfMusic_setRelativeToListener(music: NativePtr, relative: Int): Unit

fun sfMusic_setMinDistance(music: CValuesRef<sfMusic>?, distance: Float): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _distance = distance
        val res = kni_sfMusic_setMinDistance(_music, _distance)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setMinDistance")
private external fun kni_sfMusic_setMinDistance(music: NativePtr, distance: Float): Unit

fun sfMusic_setAttenuation(music: CValuesRef<sfMusic>?, attenuation: Float): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _attenuation = attenuation
        val res = kni_sfMusic_setAttenuation(_music, _attenuation)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setAttenuation")
private external fun kni_sfMusic_setAttenuation(music: NativePtr, attenuation: Float): Unit

fun sfMusic_setPlayingOffset(music: CValuesRef<sfMusic>?, timeOffset: CValue<sfTime>): Unit {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val _timeOffset = timeOffset.getPointer(memScope).rawValue
        val res = kni_sfMusic_setPlayingOffset(_music, _timeOffset)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_setPlayingOffset")
private external fun kni_sfMusic_setPlayingOffset(music: NativePtr, timeOffset: NativePtr): Unit

fun sfMusic_getPitch(music: CValuesRef<sfMusic>?): Float {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getPitch(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_getPitch")
private external fun kni_sfMusic_getPitch(music: NativePtr): Float

fun sfMusic_getVolume(music: CValuesRef<sfMusic>?): Float {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getVolume(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_getVolume")
private external fun kni_sfMusic_getVolume(music: NativePtr): Float

fun sfMusic_getPosition(music: CValuesRef<sfMusic>?): CValue<sfVector3f> {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getPosition(_music, alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfMusic_getPosition")
private external fun kni_sfMusic_getPosition(music: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfMusic_isRelativeToListener(music: CValuesRef<sfMusic>?): sfBool {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_isRelativeToListener(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_isRelativeToListener")
private external fun kni_sfMusic_isRelativeToListener(music: NativePtr): Int

fun sfMusic_getMinDistance(music: CValuesRef<sfMusic>?): Float {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getMinDistance(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_getMinDistance")
private external fun kni_sfMusic_getMinDistance(music: NativePtr): Float

fun sfMusic_getAttenuation(music: CValuesRef<sfMusic>?): Float {
    return memScoped {
        val _music = music?.getPointer(memScope).rawValue
        val res = kni_sfMusic_getAttenuation(_music)
        res
    }
}

@SymbolName("sfml_kni_sfMusic_getAttenuation")
private external fun kni_sfMusic_getAttenuation(music: NativePtr): Float

fun sfSound_create(): CPointer<sfSound>? {
    val res = kni_sfSound_create()
    return interpretCPointer<sfSound>(res)
}

@SymbolName("sfml_kni_sfSound_create")
private external fun kni_sfSound_create(): NativePtr

fun sfSound_copy(sound: CValuesRef<sfSound>?): CPointer<sfSound>? {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_copy(_sound)
        interpretCPointer<sfSound>(res)
    }
}

@SymbolName("sfml_kni_sfSound_copy")
private external fun kni_sfSound_copy(sound: NativePtr): NativePtr

fun sfSound_destroy(sound: CValuesRef<sfSound>?): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_destroy(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_destroy")
private external fun kni_sfSound_destroy(sound: NativePtr): Unit

fun sfSound_play(sound: CValuesRef<sfSound>?): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_play(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_play")
private external fun kni_sfSound_play(sound: NativePtr): Unit

fun sfSound_pause(sound: CValuesRef<sfSound>?): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_pause(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_pause")
private external fun kni_sfSound_pause(sound: NativePtr): Unit

fun sfSound_stop(sound: CValuesRef<sfSound>?): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_stop(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_stop")
private external fun kni_sfSound_stop(sound: NativePtr): Unit

fun sfSound_setBuffer(sound: CValuesRef<sfSound>?, buffer: CValuesRef<sfSoundBuffer>?): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _buffer = buffer?.getPointer(memScope).rawValue
        val res = kni_sfSound_setBuffer(_sound, _buffer)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setBuffer")
private external fun kni_sfSound_setBuffer(sound: NativePtr, buffer: NativePtr): Unit

fun sfSound_getBuffer(sound: CValuesRef<sfSound>?): CPointer<sfSoundBuffer>? {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getBuffer(_sound)
        interpretCPointer<sfSoundBuffer>(res)
    }
}

@SymbolName("sfml_kni_sfSound_getBuffer")
private external fun kni_sfSound_getBuffer(sound: NativePtr): NativePtr

fun sfSound_setLoop(sound: CValuesRef<sfSound>?, loop: sfBool): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _loop = loop
        val res = kni_sfSound_setLoop(_sound, _loop)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setLoop")
private external fun kni_sfSound_setLoop(sound: NativePtr, loop: Int): Unit

fun sfSound_getLoop(sound: CValuesRef<sfSound>?): sfBool {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getLoop(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_getLoop")
private external fun kni_sfSound_getLoop(sound: NativePtr): Int

fun sfSound_getStatus(sound: CValuesRef<sfSound>?): sfSoundStatus {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getStatus(_sound)
        sfSoundStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfSound_getStatus")
private external fun kni_sfSound_getStatus(sound: NativePtr): Int

fun sfSound_setPitch(sound: CValuesRef<sfSound>?, pitch: Float): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _pitch = pitch
        val res = kni_sfSound_setPitch(_sound, _pitch)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setPitch")
private external fun kni_sfSound_setPitch(sound: NativePtr, pitch: Float): Unit

fun sfSound_setVolume(sound: CValuesRef<sfSound>?, volume: Float): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _volume = volume
        val res = kni_sfSound_setVolume(_sound, _volume)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setVolume")
private external fun kni_sfSound_setVolume(sound: NativePtr, volume: Float): Unit

fun sfSound_setPosition(sound: CValuesRef<sfSound>?, position: CValue<sfVector3f>): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfSound_setPosition(_sound, _position)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setPosition")
private external fun kni_sfSound_setPosition(sound: NativePtr, position: NativePtr): Unit

fun sfSound_setRelativeToListener(sound: CValuesRef<sfSound>?, relative: sfBool): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _relative = relative
        val res = kni_sfSound_setRelativeToListener(_sound, _relative)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setRelativeToListener")
private external fun kni_sfSound_setRelativeToListener(sound: NativePtr, relative: Int): Unit

fun sfSound_setMinDistance(sound: CValuesRef<sfSound>?, distance: Float): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _distance = distance
        val res = kni_sfSound_setMinDistance(_sound, _distance)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setMinDistance")
private external fun kni_sfSound_setMinDistance(sound: NativePtr, distance: Float): Unit

fun sfSound_setAttenuation(sound: CValuesRef<sfSound>?, attenuation: Float): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _attenuation = attenuation
        val res = kni_sfSound_setAttenuation(_sound, _attenuation)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setAttenuation")
private external fun kni_sfSound_setAttenuation(sound: NativePtr, attenuation: Float): Unit

fun sfSound_setPlayingOffset(sound: CValuesRef<sfSound>?, timeOffset: CValue<sfTime>): Unit {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val _timeOffset = timeOffset.getPointer(memScope).rawValue
        val res = kni_sfSound_setPlayingOffset(_sound, _timeOffset)
        res
    }
}

@SymbolName("sfml_kni_sfSound_setPlayingOffset")
private external fun kni_sfSound_setPlayingOffset(sound: NativePtr, timeOffset: NativePtr): Unit

fun sfSound_getPitch(sound: CValuesRef<sfSound>?): Float {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getPitch(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_getPitch")
private external fun kni_sfSound_getPitch(sound: NativePtr): Float

fun sfSound_getVolume(sound: CValuesRef<sfSound>?): Float {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getVolume(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_getVolume")
private external fun kni_sfSound_getVolume(sound: NativePtr): Float

fun sfSound_getPosition(sound: CValuesRef<sfSound>?): CValue<sfVector3f> {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getPosition(_sound, alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSound_getPosition")
private external fun kni_sfSound_getPosition(sound: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSound_isRelativeToListener(sound: CValuesRef<sfSound>?): sfBool {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_isRelativeToListener(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_isRelativeToListener")
private external fun kni_sfSound_isRelativeToListener(sound: NativePtr): Int

fun sfSound_getMinDistance(sound: CValuesRef<sfSound>?): Float {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getMinDistance(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_getMinDistance")
private external fun kni_sfSound_getMinDistance(sound: NativePtr): Float

fun sfSound_getAttenuation(sound: CValuesRef<sfSound>?): Float {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getAttenuation(_sound)
        res
    }
}

@SymbolName("sfml_kni_sfSound_getAttenuation")
private external fun kni_sfSound_getAttenuation(sound: NativePtr): Float

fun sfSound_getPlayingOffset(sound: CValuesRef<sfSound>?): CValue<sfTime> {
    return memScoped {
        val _sound = sound?.getPointer(memScope).rawValue
        val res = kni_sfSound_getPlayingOffset(_sound, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSound_getPlayingOffset")
private external fun kni_sfSound_getPlayingOffset(sound: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSoundBuffer_createFromFile(filename: String?): CPointer<sfSoundBuffer>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_createFromFile(_filename)
        interpretCPointer<sfSoundBuffer>(res)
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_createFromFile")
private external fun kni_sfSoundBuffer_createFromFile(filename: NativePtr): NativePtr

fun sfSoundBuffer_createFromMemory(data: COpaquePointer?, sizeInBytes: size_t): CPointer<sfSoundBuffer>? {
    val _data = data.rawValue
    val _sizeInBytes = sizeInBytes
    val res = kni_sfSoundBuffer_createFromMemory(_data, _sizeInBytes)
    return interpretCPointer<sfSoundBuffer>(res)
}

@SymbolName("sfml_kni_sfSoundBuffer_createFromMemory")
private external fun kni_sfSoundBuffer_createFromMemory(data: NativePtr, sizeInBytes: Long): NativePtr

fun sfSoundBuffer_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfSoundBuffer>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_createFromStream(_stream)
        interpretCPointer<sfSoundBuffer>(res)
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_createFromStream")
private external fun kni_sfSoundBuffer_createFromStream(stream: NativePtr): NativePtr

fun sfSoundBuffer_createFromSamples(samples: CValuesRef<sfInt16Var>?, sampleCount: sfUint64, channelCount: Int, sampleRate: Int): CPointer<sfSoundBuffer>? {
    return memScoped {
        val _samples = samples?.getPointer(memScope).rawValue
        val _sampleCount = sampleCount
        val _channelCount = channelCount
        val _sampleRate = sampleRate
        val res = kni_sfSoundBuffer_createFromSamples(_samples, _sampleCount, _channelCount, _sampleRate)
        interpretCPointer<sfSoundBuffer>(res)
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_createFromSamples")
private external fun kni_sfSoundBuffer_createFromSamples(samples: NativePtr, sampleCount: Long, channelCount: Int, sampleRate: Int): NativePtr

fun sfSoundBuffer_copy(soundBuffer: CValuesRef<sfSoundBuffer>?): CPointer<sfSoundBuffer>? {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_copy(_soundBuffer)
        interpretCPointer<sfSoundBuffer>(res)
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_copy")
private external fun kni_sfSoundBuffer_copy(soundBuffer: NativePtr): NativePtr

fun sfSoundBuffer_destroy(soundBuffer: CValuesRef<sfSoundBuffer>?): Unit {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_destroy(_soundBuffer)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_destroy")
private external fun kni_sfSoundBuffer_destroy(soundBuffer: NativePtr): Unit

fun sfSoundBuffer_saveToFile(soundBuffer: CValuesRef<sfSoundBuffer>?, filename: String?): sfBool {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_saveToFile(_soundBuffer, _filename)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_saveToFile")
private external fun kni_sfSoundBuffer_saveToFile(soundBuffer: NativePtr, filename: NativePtr): Int

fun sfSoundBuffer_getSamples(soundBuffer: CValuesRef<sfSoundBuffer>?): CPointer<sfInt16Var>? {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_getSamples(_soundBuffer)
        interpretCPointer<sfInt16Var>(res)
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_getSamples")
private external fun kni_sfSoundBuffer_getSamples(soundBuffer: NativePtr): NativePtr

fun sfSoundBuffer_getSampleCount(soundBuffer: CValuesRef<sfSoundBuffer>?): sfUint64 {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_getSampleCount(_soundBuffer)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_getSampleCount")
private external fun kni_sfSoundBuffer_getSampleCount(soundBuffer: NativePtr): Long

fun sfSoundBuffer_getSampleRate(soundBuffer: CValuesRef<sfSoundBuffer>?): Int {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_getSampleRate(_soundBuffer)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_getSampleRate")
private external fun kni_sfSoundBuffer_getSampleRate(soundBuffer: NativePtr): Int

fun sfSoundBuffer_getChannelCount(soundBuffer: CValuesRef<sfSoundBuffer>?): Int {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_getChannelCount(_soundBuffer)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_getChannelCount")
private external fun kni_sfSoundBuffer_getChannelCount(soundBuffer: NativePtr): Int

fun sfSoundBuffer_getDuration(soundBuffer: CValuesRef<sfSoundBuffer>?): CValue<sfTime> {
    return memScoped {
        val _soundBuffer = soundBuffer?.getPointer(memScope).rawValue
        val res = kni_sfSoundBuffer_getDuration(_soundBuffer, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSoundBuffer_getDuration")
private external fun kni_sfSoundBuffer_getDuration(soundBuffer: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSoundBufferRecorder_create(): CPointer<sfSoundBufferRecorder>? {
    val res = kni_sfSoundBufferRecorder_create()
    return interpretCPointer<sfSoundBufferRecorder>(res)
}

@SymbolName("sfml_kni_sfSoundBufferRecorder_create")
private external fun kni_sfSoundBufferRecorder_create(): NativePtr

fun sfSoundBufferRecorder_destroy(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): Unit {
    return memScoped {
        val _soundBufferRecorder = soundBufferRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundBufferRecorder_destroy(_soundBufferRecorder)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBufferRecorder_destroy")
private external fun kni_sfSoundBufferRecorder_destroy(soundBufferRecorder: NativePtr): Unit

fun sfSoundBufferRecorder_start(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?, sampleRate: Int): Unit {
    return memScoped {
        val _soundBufferRecorder = soundBufferRecorder?.getPointer(memScope).rawValue
        val _sampleRate = sampleRate
        val res = kni_sfSoundBufferRecorder_start(_soundBufferRecorder, _sampleRate)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBufferRecorder_start")
private external fun kni_sfSoundBufferRecorder_start(soundBufferRecorder: NativePtr, sampleRate: Int): Unit

fun sfSoundBufferRecorder_stop(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): Unit {
    return memScoped {
        val _soundBufferRecorder = soundBufferRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundBufferRecorder_stop(_soundBufferRecorder)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBufferRecorder_stop")
private external fun kni_sfSoundBufferRecorder_stop(soundBufferRecorder: NativePtr): Unit

fun sfSoundBufferRecorder_getSampleRate(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): Int {
    return memScoped {
        val _soundBufferRecorder = soundBufferRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundBufferRecorder_getSampleRate(_soundBufferRecorder)
        res
    }
}

@SymbolName("sfml_kni_sfSoundBufferRecorder_getSampleRate")
private external fun kni_sfSoundBufferRecorder_getSampleRate(soundBufferRecorder: NativePtr): Int

fun sfSoundBufferRecorder_getBuffer(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): CPointer<sfSoundBuffer>? {
    return memScoped {
        val _soundBufferRecorder = soundBufferRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundBufferRecorder_getBuffer(_soundBufferRecorder)
        interpretCPointer<sfSoundBuffer>(res)
    }
}

@SymbolName("sfml_kni_sfSoundBufferRecorder_getBuffer")
private external fun kni_sfSoundBufferRecorder_getBuffer(soundBufferRecorder: NativePtr): NativePtr

fun sfSoundRecorder_create(onStart: sfSoundRecorderStartCallback?, onProcess: sfSoundRecorderProcessCallback?, onStop: sfSoundRecorderStopCallback?, userData: COpaquePointer?): CPointer<sfSoundRecorder>? {
    val _onStart = onStart.rawValue
    val _onProcess = onProcess.rawValue
    val _onStop = onStop.rawValue
    val _userData = userData.rawValue
    val res = kni_sfSoundRecorder_create(_onStart, _onProcess, _onStop, _userData)
    return interpretCPointer<sfSoundRecorder>(res)
}

@SymbolName("sfml_kni_sfSoundRecorder_create")
private external fun kni_sfSoundRecorder_create(onStart: NativePtr, onProcess: NativePtr, onStop: NativePtr, userData: NativePtr): NativePtr

fun sfSoundRecorder_destroy(soundRecorder: CValuesRef<sfSoundRecorder>?): Unit {
    return memScoped {
        val _soundRecorder = soundRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundRecorder_destroy(_soundRecorder)
        res
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_destroy")
private external fun kni_sfSoundRecorder_destroy(soundRecorder: NativePtr): Unit

fun sfSoundRecorder_start(soundRecorder: CValuesRef<sfSoundRecorder>?, sampleRate: Int): sfBool {
    return memScoped {
        val _soundRecorder = soundRecorder?.getPointer(memScope).rawValue
        val _sampleRate = sampleRate
        val res = kni_sfSoundRecorder_start(_soundRecorder, _sampleRate)
        res
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_start")
private external fun kni_sfSoundRecorder_start(soundRecorder: NativePtr, sampleRate: Int): Int

fun sfSoundRecorder_stop(soundRecorder: CValuesRef<sfSoundRecorder>?): Unit {
    return memScoped {
        val _soundRecorder = soundRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundRecorder_stop(_soundRecorder)
        res
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_stop")
private external fun kni_sfSoundRecorder_stop(soundRecorder: NativePtr): Unit

fun sfSoundRecorder_getSampleRate(soundRecorder: CValuesRef<sfSoundRecorder>?): Int {
    return memScoped {
        val _soundRecorder = soundRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundRecorder_getSampleRate(_soundRecorder)
        res
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_getSampleRate")
private external fun kni_sfSoundRecorder_getSampleRate(soundRecorder: NativePtr): Int

fun sfSoundRecorder_isAvailable(): sfBool {
    val res = kni_sfSoundRecorder_isAvailable()
    return res
}

@SymbolName("sfml_kni_sfSoundRecorder_isAvailable")
private external fun kni_sfSoundRecorder_isAvailable(): Int

fun sfSoundRecorder_setProcessingInterval(soundRecorder: CValuesRef<sfSoundRecorder>?, interval: CValue<sfTime>): Unit {
    return memScoped {
        val _soundRecorder = soundRecorder?.getPointer(memScope).rawValue
        val _interval = interval.getPointer(memScope).rawValue
        val res = kni_sfSoundRecorder_setProcessingInterval(_soundRecorder, _interval)
        res
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_setProcessingInterval")
private external fun kni_sfSoundRecorder_setProcessingInterval(soundRecorder: NativePtr, interval: NativePtr): Unit

fun sfSoundRecorder_getAvailableDevices(count: CValuesRef<size_tVar>?): CPointer<CPointerVar<ByteVar>>? {
    return memScoped {
        val _count = count?.getPointer(memScope).rawValue
        val res = kni_sfSoundRecorder_getAvailableDevices(_count)
        interpretCPointer<CPointerVar<ByteVar>>(res)
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_getAvailableDevices")
private external fun kni_sfSoundRecorder_getAvailableDevices(count: NativePtr): NativePtr

fun sfSoundRecorder_getDefaultDevice(): CPointer<ByteVar>? {
    val res = kni_sfSoundRecorder_getDefaultDevice()
    return interpretCPointer<ByteVar>(res)
}

@SymbolName("sfml_kni_sfSoundRecorder_getDefaultDevice")
private external fun kni_sfSoundRecorder_getDefaultDevice(): NativePtr

fun sfSoundRecorder_setDevice(soundRecorder: CValuesRef<sfSoundRecorder>?, name: String?): sfBool {
    return memScoped {
        val _soundRecorder = soundRecorder?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfSoundRecorder_setDevice(_soundRecorder, _name)
        res
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_setDevice")
private external fun kni_sfSoundRecorder_setDevice(soundRecorder: NativePtr, name: NativePtr): Int

fun sfSoundRecorder_getDevice(soundRecorder: CValuesRef<sfSoundRecorder>?): CPointer<ByteVar>? {
    return memScoped {
        val _soundRecorder = soundRecorder?.getPointer(memScope).rawValue
        val res = kni_sfSoundRecorder_getDevice(_soundRecorder)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfSoundRecorder_getDevice")
private external fun kni_sfSoundRecorder_getDevice(soundRecorder: NativePtr): NativePtr

fun sfSoundStream_create(onGetData: sfSoundStreamGetDataCallback?, onSeek: sfSoundStreamSeekCallback?, channelCount: Int, sampleRate: Int, userData: COpaquePointer?): CPointer<sfSoundStream>? {
    val _onGetData = onGetData.rawValue
    val _onSeek = onSeek.rawValue
    val _channelCount = channelCount
    val _sampleRate = sampleRate
    val _userData = userData.rawValue
    val res = kni_sfSoundStream_create(_onGetData, _onSeek, _channelCount, _sampleRate, _userData)
    return interpretCPointer<sfSoundStream>(res)
}

@SymbolName("sfml_kni_sfSoundStream_create")
private external fun kni_sfSoundStream_create(onGetData: NativePtr, onSeek: NativePtr, channelCount: Int, sampleRate: Int, userData: NativePtr): NativePtr

fun sfSoundStream_destroy(soundStream: CValuesRef<sfSoundStream>?): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_destroy(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_destroy")
private external fun kni_sfSoundStream_destroy(soundStream: NativePtr): Unit

fun sfSoundStream_play(soundStream: CValuesRef<sfSoundStream>?): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_play(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_play")
private external fun kni_sfSoundStream_play(soundStream: NativePtr): Unit

fun sfSoundStream_pause(soundStream: CValuesRef<sfSoundStream>?): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_pause(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_pause")
private external fun kni_sfSoundStream_pause(soundStream: NativePtr): Unit

fun sfSoundStream_stop(soundStream: CValuesRef<sfSoundStream>?): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_stop(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_stop")
private external fun kni_sfSoundStream_stop(soundStream: NativePtr): Unit

fun sfSoundStream_getStatus(soundStream: CValuesRef<sfSoundStream>?): sfSoundStatus {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getStatus(_soundStream)
        sfSoundStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfSoundStream_getStatus")
private external fun kni_sfSoundStream_getStatus(soundStream: NativePtr): Int

fun sfSoundStream_getChannelCount(soundStream: CValuesRef<sfSoundStream>?): Int {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getChannelCount(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_getChannelCount")
private external fun kni_sfSoundStream_getChannelCount(soundStream: NativePtr): Int

fun sfSoundStream_getSampleRate(soundStream: CValuesRef<sfSoundStream>?): Int {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getSampleRate(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_getSampleRate")
private external fun kni_sfSoundStream_getSampleRate(soundStream: NativePtr): Int

fun sfSoundStream_setPitch(soundStream: CValuesRef<sfSoundStream>?, pitch: Float): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _pitch = pitch
        val res = kni_sfSoundStream_setPitch(_soundStream, _pitch)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setPitch")
private external fun kni_sfSoundStream_setPitch(soundStream: NativePtr, pitch: Float): Unit

fun sfSoundStream_setVolume(soundStream: CValuesRef<sfSoundStream>?, volume: Float): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _volume = volume
        val res = kni_sfSoundStream_setVolume(_soundStream, _volume)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setVolume")
private external fun kni_sfSoundStream_setVolume(soundStream: NativePtr, volume: Float): Unit

fun sfSoundStream_setPosition(soundStream: CValuesRef<sfSoundStream>?, position: CValue<sfVector3f>): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_setPosition(_soundStream, _position)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setPosition")
private external fun kni_sfSoundStream_setPosition(soundStream: NativePtr, position: NativePtr): Unit

fun sfSoundStream_setRelativeToListener(soundStream: CValuesRef<sfSoundStream>?, relative: sfBool): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _relative = relative
        val res = kni_sfSoundStream_setRelativeToListener(_soundStream, _relative)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setRelativeToListener")
private external fun kni_sfSoundStream_setRelativeToListener(soundStream: NativePtr, relative: Int): Unit

fun sfSoundStream_setMinDistance(soundStream: CValuesRef<sfSoundStream>?, distance: Float): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _distance = distance
        val res = kni_sfSoundStream_setMinDistance(_soundStream, _distance)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setMinDistance")
private external fun kni_sfSoundStream_setMinDistance(soundStream: NativePtr, distance: Float): Unit

fun sfSoundStream_setAttenuation(soundStream: CValuesRef<sfSoundStream>?, attenuation: Float): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _attenuation = attenuation
        val res = kni_sfSoundStream_setAttenuation(_soundStream, _attenuation)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setAttenuation")
private external fun kni_sfSoundStream_setAttenuation(soundStream: NativePtr, attenuation: Float): Unit

fun sfSoundStream_setPlayingOffset(soundStream: CValuesRef<sfSoundStream>?, timeOffset: CValue<sfTime>): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _timeOffset = timeOffset.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_setPlayingOffset(_soundStream, _timeOffset)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setPlayingOffset")
private external fun kni_sfSoundStream_setPlayingOffset(soundStream: NativePtr, timeOffset: NativePtr): Unit

fun sfSoundStream_setLoop(soundStream: CValuesRef<sfSoundStream>?, loop: sfBool): Unit {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val _loop = loop
        val res = kni_sfSoundStream_setLoop(_soundStream, _loop)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_setLoop")
private external fun kni_sfSoundStream_setLoop(soundStream: NativePtr, loop: Int): Unit

fun sfSoundStream_getPitch(soundStream: CValuesRef<sfSoundStream>?): Float {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getPitch(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_getPitch")
private external fun kni_sfSoundStream_getPitch(soundStream: NativePtr): Float

fun sfSoundStream_getVolume(soundStream: CValuesRef<sfSoundStream>?): Float {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getVolume(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_getVolume")
private external fun kni_sfSoundStream_getVolume(soundStream: NativePtr): Float

fun sfSoundStream_getPosition(soundStream: CValuesRef<sfSoundStream>?): CValue<sfVector3f> {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getPosition(_soundStream, alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSoundStream_getPosition")
private external fun kni_sfSoundStream_getPosition(soundStream: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSoundStream_isRelativeToListener(soundStream: CValuesRef<sfSoundStream>?): sfBool {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_isRelativeToListener(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_isRelativeToListener")
private external fun kni_sfSoundStream_isRelativeToListener(soundStream: NativePtr): Int

fun sfSoundStream_getMinDistance(soundStream: CValuesRef<sfSoundStream>?): Float {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getMinDistance(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_getMinDistance")
private external fun kni_sfSoundStream_getMinDistance(soundStream: NativePtr): Float

fun sfSoundStream_getAttenuation(soundStream: CValuesRef<sfSoundStream>?): Float {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getAttenuation(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_getAttenuation")
private external fun kni_sfSoundStream_getAttenuation(soundStream: NativePtr): Float

fun sfSoundStream_getLoop(soundStream: CValuesRef<sfSoundStream>?): sfBool {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getLoop(_soundStream)
        res
    }
}

@SymbolName("sfml_kni_sfSoundStream_getLoop")
private external fun kni_sfSoundStream_getLoop(soundStream: NativePtr): Int

fun sfSoundStream_getPlayingOffset(soundStream: CValuesRef<sfSoundStream>?): CValue<sfTime> {
    return memScoped {
        val _soundStream = soundStream?.getPointer(memScope).rawValue
        val res = kni_sfSoundStream_getPlayingOffset(_soundStream, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSoundStream_getPlayingOffset")
private external fun kni_sfSoundStream_getPlayingOffset(soundStream: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfContext_create(): CPointer<sfContext>? {
    val res = kni_sfContext_create()
    return interpretCPointer<sfContext>(res)
}

@SymbolName("sfml_kni_sfContext_create")
private external fun kni_sfContext_create(): NativePtr

fun sfContext_destroy(context: CValuesRef<sfContext>?): Unit {
    return memScoped {
        val _context = context?.getPointer(memScope).rawValue
        val res = kni_sfContext_destroy(_context)
        res
    }
}

@SymbolName("sfml_kni_sfContext_destroy")
private external fun kni_sfContext_destroy(context: NativePtr): Unit

fun sfContext_setActive(context: CValuesRef<sfContext>?, active: sfBool): Unit {
    return memScoped {
        val _context = context?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfContext_setActive(_context, _active)
        res
    }
}

@SymbolName("sfml_kni_sfContext_setActive")
private external fun kni_sfContext_setActive(context: NativePtr, active: Int): Unit

fun sfJoystick_isConnected(joystick: Int): sfBool {
    val _joystick = joystick
    val res = kni_sfJoystick_isConnected(_joystick)
    return res
}

@SymbolName("sfml_kni_sfJoystick_isConnected")
private external fun kni_sfJoystick_isConnected(joystick: Int): Int

fun sfJoystick_getButtonCount(joystick: Int): Int {
    val _joystick = joystick
    val res = kni_sfJoystick_getButtonCount(_joystick)
    return res
}

@SymbolName("sfml_kni_sfJoystick_getButtonCount")
private external fun kni_sfJoystick_getButtonCount(joystick: Int): Int

fun sfJoystick_hasAxis(joystick: Int, axis: sfJoystickAxis): sfBool {
    val _joystick = joystick
    val _axis = axis.value
    val res = kni_sfJoystick_hasAxis(_joystick, _axis)
    return res
}

@SymbolName("sfml_kni_sfJoystick_hasAxis")
private external fun kni_sfJoystick_hasAxis(joystick: Int, axis: Int): Int

fun sfJoystick_isButtonPressed(joystick: Int, button: Int): sfBool {
    val _joystick = joystick
    val _button = button
    val res = kni_sfJoystick_isButtonPressed(_joystick, _button)
    return res
}

@SymbolName("sfml_kni_sfJoystick_isButtonPressed")
private external fun kni_sfJoystick_isButtonPressed(joystick: Int, button: Int): Int

fun sfJoystick_getAxisPosition(joystick: Int, axis: sfJoystickAxis): Float {
    val _joystick = joystick
    val _axis = axis.value
    val res = kni_sfJoystick_getAxisPosition(_joystick, _axis)
    return res
}

@SymbolName("sfml_kni_sfJoystick_getAxisPosition")
private external fun kni_sfJoystick_getAxisPosition(joystick: Int, axis: Int): Float

fun sfJoystick_getIdentification(joystick: Int): CValue<sfJoystickIdentification> {
    return memScoped {
        val _joystick = joystick
        val res = kni_sfJoystick_getIdentification(_joystick, alloc<sfJoystickIdentification>().rawPtr)
        interpretPointed<sfJoystickIdentification>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfJoystick_getIdentification")
private external fun kni_sfJoystick_getIdentification(joystick: Int, retValPlacement: NativePtr): NativePtr

fun sfJoystick_update(): Unit {
    val res = kni_sfJoystick_update()
    return res
}

@SymbolName("sfml_kni_sfJoystick_update")
private external fun kni_sfJoystick_update(): Unit

fun sfKeyboard_isKeyPressed(key: sfKeyCode): sfBool {
    val _key = key
    val res = kni_sfKeyboard_isKeyPressed(_key)
    return res
}

@SymbolName("sfml_kni_sfKeyboard_isKeyPressed")
private external fun kni_sfKeyboard_isKeyPressed(key: Int): Int

fun sfMouse_isButtonPressed(button: sfMouseButton): sfBool {
    val _button = button.value
    val res = kni_sfMouse_isButtonPressed(_button)
    return res
}

@SymbolName("sfml_kni_sfMouse_isButtonPressed")
private external fun kni_sfMouse_isButtonPressed(button: Int): Int

fun sfMouse_getPosition(relativeTo: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_getPosition(_relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfMouse_getPosition")
private external fun kni_sfMouse_getPosition(relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfMouse_setPosition(position: CValue<sfVector2i>, relativeTo: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _position = position.getPointer(memScope).rawValue
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_setPosition(_position, _relativeTo)
        res
    }
}

@SymbolName("sfml_kni_sfMouse_setPosition")
private external fun kni_sfMouse_setPosition(position: NativePtr, relativeTo: NativePtr): Unit

fun sfSensor_isAvailable(sensor: sfSensorType): sfBool {
    val _sensor = sensor.value
    val res = kni_sfSensor_isAvailable(_sensor)
    return res
}

@SymbolName("sfml_kni_sfSensor_isAvailable")
private external fun kni_sfSensor_isAvailable(sensor: Int): Int

fun sfSensor_setEnabled(sensor: sfSensorType, enabled: sfBool): Unit {
    val _sensor = sensor.value
    val _enabled = enabled
    val res = kni_sfSensor_setEnabled(_sensor, _enabled)
    return res
}

@SymbolName("sfml_kni_sfSensor_setEnabled")
private external fun kni_sfSensor_setEnabled(sensor: Int, enabled: Int): Unit

fun sfSensor_getValue(sensor: sfSensorType): CValue<sfVector3f> {
    return memScoped {
        val _sensor = sensor.value
        val res = kni_sfSensor_getValue(_sensor, alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSensor_getValue")
private external fun kni_sfSensor_getValue(sensor: Int, retValPlacement: NativePtr): NativePtr

fun sfTouch_isDown(finger: Int): sfBool {
    val _finger = finger
    val res = kni_sfTouch_isDown(_finger)
    return res
}

@SymbolName("sfml_kni_sfTouch_isDown")
private external fun kni_sfTouch_isDown(finger: Int): Int

fun sfTouch_getPosition(finger: Int, relativeTo: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _finger = finger
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfTouch_getPosition(_finger, _relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTouch_getPosition")
private external fun kni_sfTouch_getPosition(finger: Int, relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfVideoMode_getDesktopMode(): CValue<sfVideoMode> {
    return memScoped {
        val res = kni_sfVideoMode_getDesktopMode(alloc<sfVideoMode>().rawPtr)
        interpretPointed<sfVideoMode>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfVideoMode_getDesktopMode")
private external fun kni_sfVideoMode_getDesktopMode(retValPlacement: NativePtr): NativePtr

fun sfVideoMode_getFullscreenModes(Count: CValuesRef<size_tVar>?): CPointer<sfVideoMode>? {
    return memScoped {
        val _Count = Count?.getPointer(memScope).rawValue
        val res = kni_sfVideoMode_getFullscreenModes(_Count)
        interpretCPointer<sfVideoMode>(res)
    }
}

@SymbolName("sfml_kni_sfVideoMode_getFullscreenModes")
private external fun kni_sfVideoMode_getFullscreenModes(Count: NativePtr): NativePtr

fun sfVideoMode_isValid(mode: CValue<sfVideoMode>): sfBool {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val res = kni_sfVideoMode_isValid(_mode)
        res
    }
}

@SymbolName("sfml_kni_sfVideoMode_isValid")
private external fun kni_sfVideoMode_isValid(mode: NativePtr): Int

fun sfWindow_create(mode: CValue<sfVideoMode>, title: String?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfWindow_create(_mode, _title, _style, _settings)
        interpretCPointer<sfWindow>(res)
    }
}

@SymbolName("sfml_kni_sfWindow_create")
private external fun kni_sfWindow_create(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

fun sfWindow_createUnicode(mode: CValue<sfVideoMode>, title: CValuesRef<sfUint32Var>?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfWindow_createUnicode(_mode, _title, _style, _settings)
        interpretCPointer<sfWindow>(res)
    }
}

@SymbolName("sfml_kni_sfWindow_createUnicode")
private external fun kni_sfWindow_createUnicode(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

fun sfWindow_createFromHandle(handle: sfWindowHandle, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    return memScoped {
        val _handle = handle
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfWindow_createFromHandle(_handle, _settings)
        interpretCPointer<sfWindow>(res)
    }
}

@SymbolName("sfml_kni_sfWindow_createFromHandle")
private external fun kni_sfWindow_createFromHandle(handle: Long, settings: NativePtr): NativePtr

fun sfWindow_destroy(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_destroy(_window)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_destroy")
private external fun kni_sfWindow_destroy(window: NativePtr): Unit

fun sfWindow_close(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_close(_window)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_close")
private external fun kni_sfWindow_close(window: NativePtr): Unit

fun sfWindow_isOpen(window: CValuesRef<sfWindow>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_isOpen(_window)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_isOpen")
private external fun kni_sfWindow_isOpen(window: NativePtr): Int

fun sfWindow_getSettings(window: CValuesRef<sfWindow>?): CValue<sfContextSettings> {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getSettings(_window, alloc<sfContextSettings>().rawPtr)
        interpretPointed<sfContextSettings>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfWindow_getSettings")
private external fun kni_sfWindow_getSettings(window: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfWindow_pollEvent(window: CValuesRef<sfWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfWindow_pollEvent(_window, _event)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_pollEvent")
private external fun kni_sfWindow_pollEvent(window: NativePtr, event: NativePtr): Int

fun sfWindow_waitEvent(window: CValuesRef<sfWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfWindow_waitEvent(_window, _event)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_waitEvent")
private external fun kni_sfWindow_waitEvent(window: NativePtr, event: NativePtr): Int

fun sfWindow_getPosition(window: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getPosition(_window, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfWindow_getPosition")
private external fun kni_sfWindow_getPosition(window: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfWindow_setPosition(window: CValuesRef<sfWindow>?, position: CValue<sfVector2i>): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfWindow_setPosition(_window, _position)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setPosition")
private external fun kni_sfWindow_setPosition(window: NativePtr, position: NativePtr): Unit

fun sfWindow_getSize(window: CValuesRef<sfWindow>?): CValue<sfVector2u> {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getSize(_window, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfWindow_getSize")
private external fun kni_sfWindow_getSize(window: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfWindow_setSize(window: CValuesRef<sfWindow>?, size: CValue<sfVector2u>): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfWindow_setSize(_window, _size)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setSize")
private external fun kni_sfWindow_setSize(window: NativePtr, size: NativePtr): Unit

fun sfWindow_setTitle(window: CValuesRef<sfWindow>?, title: String?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfWindow_setTitle(_window, _title)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setTitle")
private external fun kni_sfWindow_setTitle(window: NativePtr, title: NativePtr): Unit

fun sfWindow_setUnicodeTitle(window: CValuesRef<sfWindow>?, title: CValuesRef<sfUint32Var>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val res = kni_sfWindow_setUnicodeTitle(_window, _title)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setUnicodeTitle")
private external fun kni_sfWindow_setUnicodeTitle(window: NativePtr, title: NativePtr): Unit

fun sfWindow_setIcon(window: CValuesRef<sfWindow>?, width: Int, height: Int, pixels: CValuesRef<sfUint8Var>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _width = width
        val _height = height
        val _pixels = pixels?.getPointer(memScope).rawValue
        val res = kni_sfWindow_setIcon(_window, _width, _height, _pixels)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setIcon")
private external fun kni_sfWindow_setIcon(window: NativePtr, width: Int, height: Int, pixels: NativePtr): Unit

fun sfWindow_setVisible(window: CValuesRef<sfWindow>?, visible: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _visible = visible
        val res = kni_sfWindow_setVisible(_window, _visible)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setVisible")
private external fun kni_sfWindow_setVisible(window: NativePtr, visible: Int): Unit

fun sfWindow_setMouseCursorVisible(window: CValuesRef<sfWindow>?, visible: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _visible = visible
        val res = kni_sfWindow_setMouseCursorVisible(_window, _visible)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setMouseCursorVisible")
private external fun kni_sfWindow_setMouseCursorVisible(window: NativePtr, visible: Int): Unit

fun sfWindow_setVerticalSyncEnabled(window: CValuesRef<sfWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfWindow_setVerticalSyncEnabled(_window, _enabled)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setVerticalSyncEnabled")
private external fun kni_sfWindow_setVerticalSyncEnabled(window: NativePtr, enabled: Int): Unit

fun sfWindow_setKeyRepeatEnabled(window: CValuesRef<sfWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfWindow_setKeyRepeatEnabled(_window, _enabled)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setKeyRepeatEnabled")
private external fun kni_sfWindow_setKeyRepeatEnabled(window: NativePtr, enabled: Int): Unit

fun sfWindow_setActive(window: CValuesRef<sfWindow>?, active: sfBool): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfWindow_setActive(_window, _active)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setActive")
private external fun kni_sfWindow_setActive(window: NativePtr, active: Int): Int

fun sfWindow_requestFocus(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_requestFocus(_window)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_requestFocus")
private external fun kni_sfWindow_requestFocus(window: NativePtr): Unit

fun sfWindow_hasFocus(window: CValuesRef<sfWindow>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_hasFocus(_window)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_hasFocus")
private external fun kni_sfWindow_hasFocus(window: NativePtr): Int

fun sfWindow_display(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_display(_window)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_display")
private external fun kni_sfWindow_display(window: NativePtr): Unit

fun sfWindow_setFramerateLimit(window: CValuesRef<sfWindow>?, limit: Int): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _limit = limit
        val res = kni_sfWindow_setFramerateLimit(_window, _limit)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setFramerateLimit")
private external fun kni_sfWindow_setFramerateLimit(window: NativePtr, limit: Int): Unit

fun sfWindow_setJoystickThreshold(window: CValuesRef<sfWindow>?, threshold: Float): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _threshold = threshold
        val res = kni_sfWindow_setJoystickThreshold(_window, _threshold)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_setJoystickThreshold")
private external fun kni_sfWindow_setJoystickThreshold(window: NativePtr, threshold: Float): Unit

fun sfWindow_getSystemHandle(window: CValuesRef<sfWindow>?): sfWindowHandle {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getSystemHandle(_window)
        res
    }
}

@SymbolName("sfml_kni_sfWindow_getSystemHandle")
private external fun kni_sfWindow_getSystemHandle(window: NativePtr): Long

fun sfColor_fromRGB(red: sfUint8, green: sfUint8, blue: sfUint8): CValue<sfColor> {
    return memScoped {
        val _red = red
        val _green = green
        val _blue = blue
        val res = kni_sfColor_fromRGB(_red, _green, _blue, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfColor_fromRGB")
private external fun kni_sfColor_fromRGB(red: Byte, green: Byte, blue: Byte, retValPlacement: NativePtr): NativePtr

fun sfColor_fromRGBA(red: sfUint8, green: sfUint8, blue: sfUint8, alpha: sfUint8): CValue<sfColor> {
    return memScoped {
        val _red = red
        val _green = green
        val _blue = blue
        val _alpha = alpha
        val res = kni_sfColor_fromRGBA(_red, _green, _blue, _alpha, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfColor_fromRGBA")
private external fun kni_sfColor_fromRGBA(red: Byte, green: Byte, blue: Byte, alpha: Byte, retValPlacement: NativePtr): NativePtr

fun sfColor_fromInteger(color: sfUint32): CValue<sfColor> {
    return memScoped {
        val _color = color
        val res = kni_sfColor_fromInteger(_color, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfColor_fromInteger")
private external fun kni_sfColor_fromInteger(color: Int, retValPlacement: NativePtr): NativePtr

fun sfColor_toInteger(color: CValue<sfColor>): sfUint32 {
    return memScoped {
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfColor_toInteger(_color)
        res
    }
}

@SymbolName("sfml_kni_sfColor_toInteger")
private external fun kni_sfColor_toInteger(color: NativePtr): Int

fun sfColor_add(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    return memScoped {
        val _color1 = color1.getPointer(memScope).rawValue
        val _color2 = color2.getPointer(memScope).rawValue
        val res = kni_sfColor_add(_color1, _color2, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfColor_add")
private external fun kni_sfColor_add(color1: NativePtr, color2: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfColor_subtract(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    return memScoped {
        val _color1 = color1.getPointer(memScope).rawValue
        val _color2 = color2.getPointer(memScope).rawValue
        val res = kni_sfColor_subtract(_color1, _color2, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfColor_subtract")
private external fun kni_sfColor_subtract(color1: NativePtr, color2: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfColor_modulate(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    return memScoped {
        val _color1 = color1.getPointer(memScope).rawValue
        val _color2 = color2.getPointer(memScope).rawValue
        val res = kni_sfColor_modulate(_color1, _color2, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfColor_modulate")
private external fun kni_sfColor_modulate(color1: NativePtr, color2: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfFloatRect_contains(rect: CValuesRef<sfFloatRect>?, x: Float, y: Float): sfBool {
    return memScoped {
        val _rect = rect?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfFloatRect_contains(_rect, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfFloatRect_contains")
private external fun kni_sfFloatRect_contains(rect: NativePtr, x: Float, y: Float): Int

fun sfIntRect_contains(rect: CValuesRef<sfIntRect>?, x: Int, y: Int): sfBool {
    return memScoped {
        val _rect = rect?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfIntRect_contains(_rect, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfIntRect_contains")
private external fun kni_sfIntRect_contains(rect: NativePtr, x: Int, y: Int): Int

fun sfFloatRect_intersects(rect1: CValuesRef<sfFloatRect>?, rect2: CValuesRef<sfFloatRect>?, intersection: CValuesRef<sfFloatRect>?): sfBool {
    return memScoped {
        val _rect1 = rect1?.getPointer(memScope).rawValue
        val _rect2 = rect2?.getPointer(memScope).rawValue
        val _intersection = intersection?.getPointer(memScope).rawValue
        val res = kni_sfFloatRect_intersects(_rect1, _rect2, _intersection)
        res
    }
}

@SymbolName("sfml_kni_sfFloatRect_intersects")
private external fun kni_sfFloatRect_intersects(rect1: NativePtr, rect2: NativePtr, intersection: NativePtr): Int

fun sfIntRect_intersects(rect1: CValuesRef<sfIntRect>?, rect2: CValuesRef<sfIntRect>?, intersection: CValuesRef<sfIntRect>?): sfBool {
    return memScoped {
        val _rect1 = rect1?.getPointer(memScope).rawValue
        val _rect2 = rect2?.getPointer(memScope).rawValue
        val _intersection = intersection?.getPointer(memScope).rawValue
        val res = kni_sfIntRect_intersects(_rect1, _rect2, _intersection)
        res
    }
}

@SymbolName("sfml_kni_sfIntRect_intersects")
private external fun kni_sfIntRect_intersects(rect1: NativePtr, rect2: NativePtr, intersection: NativePtr): Int

fun sfTransform_fromMatrix(a00: Float, a01: Float, a02: Float, a10: Float, a11: Float, a12: Float, a20: Float, a21: Float, a22: Float): CValue<sfTransform> {
    return memScoped {
        val _a00 = a00
        val _a01 = a01
        val _a02 = a02
        val _a10 = a10
        val _a11 = a11
        val _a12 = a12
        val _a20 = a20
        val _a21 = a21
        val _a22 = a22
        val res = kni_sfTransform_fromMatrix(_a00, _a01, _a02, _a10, _a11, _a12, _a20, _a21, _a22, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransform_fromMatrix")
private external fun kni_sfTransform_fromMatrix(a00: Float, a01: Float, a02: Float, a10: Float, a11: Float, a12: Float, a20: Float, a21: Float, a22: Float, retValPlacement: NativePtr): NativePtr

fun sfTransform_getMatrix(transform: CValuesRef<sfTransform>?, matrix: CValuesRef<FloatVar>?): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _matrix = matrix?.getPointer(memScope).rawValue
        val res = kni_sfTransform_getMatrix(_transform, _matrix)
        res
    }
}

@SymbolName("sfml_kni_sfTransform_getMatrix")
private external fun kni_sfTransform_getMatrix(transform: NativePtr, matrix: NativePtr): Unit

fun sfTransform_getInverse(transform: CValuesRef<sfTransform>?): CValue<sfTransform> {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val res = kni_sfTransform_getInverse(_transform, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransform_getInverse")
private external fun kni_sfTransform_getInverse(transform: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTransform_transformPoint(transform: CValuesRef<sfTransform>?, point: CValue<sfVector2f>): CValue<sfVector2f> {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val res = kni_sfTransform_transformPoint(_transform, _point, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransform_transformPoint")
private external fun kni_sfTransform_transformPoint(transform: NativePtr, point: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTransform_transformRect(transform: CValuesRef<sfTransform>?, rectangle: CValue<sfFloatRect>): CValue<sfFloatRect> {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfTransform_transformRect(_transform, _rectangle, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransform_transformRect")
private external fun kni_sfTransform_transformRect(transform: NativePtr, rectangle: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTransform_combine(transform: CValuesRef<sfTransform>?, other: CValuesRef<sfTransform>?): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _other = other?.getPointer(memScope).rawValue
        val res = kni_sfTransform_combine(_transform, _other)
        res
    }
}

@SymbolName("sfml_kni_sfTransform_combine")
private external fun kni_sfTransform_combine(transform: NativePtr, other: NativePtr): Unit

fun sfTransform_translate(transform: CValuesRef<sfTransform>?, x: Float, y: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTransform_translate(_transform, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfTransform_translate")
private external fun kni_sfTransform_translate(transform: NativePtr, x: Float, y: Float): Unit

fun sfTransform_rotate(transform: CValuesRef<sfTransform>?, angle: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfTransform_rotate(_transform, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfTransform_rotate")
private external fun kni_sfTransform_rotate(transform: NativePtr, angle: Float): Unit

fun sfTransform_rotateWithCenter(transform: CValuesRef<sfTransform>?, angle: Float, centerX: Float, centerY: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _angle = angle
        val _centerX = centerX
        val _centerY = centerY
        val res = kni_sfTransform_rotateWithCenter(_transform, _angle, _centerX, _centerY)
        res
    }
}

@SymbolName("sfml_kni_sfTransform_rotateWithCenter")
private external fun kni_sfTransform_rotateWithCenter(transform: NativePtr, angle: Float, centerX: Float, centerY: Float): Unit

fun sfTransform_scale(transform: CValuesRef<sfTransform>?, scaleX: Float, scaleY: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _scaleX = scaleX
        val _scaleY = scaleY
        val res = kni_sfTransform_scale(_transform, _scaleX, _scaleY)
        res
    }
}

@SymbolName("sfml_kni_sfTransform_scale")
private external fun kni_sfTransform_scale(transform: NativePtr, scaleX: Float, scaleY: Float): Unit

fun sfTransform_scaleWithCenter(transform: CValuesRef<sfTransform>?, scaleX: Float, scaleY: Float, centerX: Float, centerY: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _scaleX = scaleX
        val _scaleY = scaleY
        val _centerX = centerX
        val _centerY = centerY
        val res = kni_sfTransform_scaleWithCenter(_transform, _scaleX, _scaleY, _centerX, _centerY)
        res
    }
}

@SymbolName("sfml_kni_sfTransform_scaleWithCenter")
private external fun kni_sfTransform_scaleWithCenter(transform: NativePtr, scaleX: Float, scaleY: Float, centerX: Float, centerY: Float): Unit

fun sfCircleShape_create(): CPointer<sfCircleShape>? {
    val res = kni_sfCircleShape_create()
    return interpretCPointer<sfCircleShape>(res)
}

@SymbolName("sfml_kni_sfCircleShape_create")
private external fun kni_sfCircleShape_create(): NativePtr

fun sfCircleShape_copy(shape: CValuesRef<sfCircleShape>?): CPointer<sfCircleShape>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_copy(_shape)
        interpretCPointer<sfCircleShape>(res)
    }
}

@SymbolName("sfml_kni_sfCircleShape_copy")
private external fun kni_sfCircleShape_copy(shape: NativePtr): NativePtr

fun sfCircleShape_destroy(shape: CValuesRef<sfCircleShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_destroy(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_destroy")
private external fun kni_sfCircleShape_destroy(shape: NativePtr): Unit

fun sfCircleShape_setPosition(shape: CValuesRef<sfCircleShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setPosition(_shape, _position)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setPosition")
private external fun kni_sfCircleShape_setPosition(shape: NativePtr, position: NativePtr): Unit

fun sfCircleShape_setRotation(shape: CValuesRef<sfCircleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfCircleShape_setRotation(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setRotation")
private external fun kni_sfCircleShape_setRotation(shape: NativePtr, angle: Float): Unit

fun sfCircleShape_setScale(shape: CValuesRef<sfCircleShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setScale(_shape, _scale)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setScale")
private external fun kni_sfCircleShape_setScale(shape: NativePtr, scale: NativePtr): Unit

fun sfCircleShape_setOrigin(shape: CValuesRef<sfCircleShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setOrigin(_shape, _origin)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setOrigin")
private external fun kni_sfCircleShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

fun sfCircleShape_getPosition(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getPosition")
private external fun kni_sfCircleShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_getRotation(shape: CValuesRef<sfCircleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getRotation(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_getRotation")
private external fun kni_sfCircleShape_getRotation(shape: NativePtr): Float

fun sfCircleShape_getScale(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getScale")
private external fun kni_sfCircleShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_getOrigin(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getOrigin")
private external fun kni_sfCircleShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_move(shape: CValuesRef<sfCircleShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_move(_shape, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_move")
private external fun kni_sfCircleShape_move(shape: NativePtr, offset: NativePtr): Unit

fun sfCircleShape_rotate(shape: CValuesRef<sfCircleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfCircleShape_rotate(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_rotate")
private external fun kni_sfCircleShape_rotate(shape: NativePtr, angle: Float): Unit

fun sfCircleShape_scale(shape: CValuesRef<sfCircleShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_scale(_shape, _factors)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_scale")
private external fun kni_sfCircleShape_scale(shape: NativePtr, factors: NativePtr): Unit

fun sfCircleShape_getTransform(shape: CValuesRef<sfCircleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getTransform")
private external fun kni_sfCircleShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_getInverseTransform(shape: CValuesRef<sfCircleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getInverseTransform")
private external fun kni_sfCircleShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_setTexture(shape: CValuesRef<sfCircleShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfCircleShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setTexture")
private external fun kni_sfCircleShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

fun sfCircleShape_setTextureRect(shape: CValuesRef<sfCircleShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setTextureRect(_shape, _rect)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setTextureRect")
private external fun kni_sfCircleShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

fun sfCircleShape_setFillColor(shape: CValuesRef<sfCircleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setFillColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setFillColor")
private external fun kni_sfCircleShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

fun sfCircleShape_setOutlineColor(shape: CValuesRef<sfCircleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setOutlineColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setOutlineColor")
private external fun kni_sfCircleShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

fun sfCircleShape_setOutlineThickness(shape: CValuesRef<sfCircleShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfCircleShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setOutlineThickness")
private external fun kni_sfCircleShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

fun sfCircleShape_getTexture(shape: CValuesRef<sfCircleShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfCircleShape_getTexture")
private external fun kni_sfCircleShape_getTexture(shape: NativePtr): NativePtr

fun sfCircleShape_getTextureRect(shape: CValuesRef<sfCircleShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getTextureRect")
private external fun kni_sfCircleShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_getFillColor(shape: CValuesRef<sfCircleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getFillColor")
private external fun kni_sfCircleShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_getOutlineColor(shape: CValuesRef<sfCircleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getOutlineColor")
private external fun kni_sfCircleShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_getOutlineThickness(shape: CValuesRef<sfCircleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getOutlineThickness(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_getOutlineThickness")
private external fun kni_sfCircleShape_getOutlineThickness(shape: NativePtr): Float

fun sfCircleShape_getPointCount(shape: CValuesRef<sfCircleShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getPointCount(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_getPointCount")
private external fun kni_sfCircleShape_getPointCount(shape: NativePtr): Long

fun sfCircleShape_getPoint(shape: CValuesRef<sfCircleShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfCircleShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getPoint")
private external fun kni_sfCircleShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_setRadius(shape: CValuesRef<sfCircleShape>?, radius: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _radius = radius
        val res = kni_sfCircleShape_setRadius(_shape, _radius)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setRadius")
private external fun kni_sfCircleShape_setRadius(shape: NativePtr, radius: Float): Unit

fun sfCircleShape_getRadius(shape: CValuesRef<sfCircleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getRadius(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_getRadius")
private external fun kni_sfCircleShape_getRadius(shape: NativePtr): Float

fun sfCircleShape_setPointCount(shape: CValuesRef<sfCircleShape>?, count: size_t): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_sfCircleShape_setPointCount(_shape, _count)
        res
    }
}

@SymbolName("sfml_kni_sfCircleShape_setPointCount")
private external fun kni_sfCircleShape_setPointCount(shape: NativePtr, count: Long): Unit

fun sfCircleShape_getLocalBounds(shape: CValuesRef<sfCircleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getLocalBounds")
private external fun kni_sfCircleShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfCircleShape_getGlobalBounds(shape: CValuesRef<sfCircleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfCircleShape_getGlobalBounds")
private external fun kni_sfCircleShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_create(): CPointer<sfConvexShape>? {
    val res = kni_sfConvexShape_create()
    return interpretCPointer<sfConvexShape>(res)
}

@SymbolName("sfml_kni_sfConvexShape_create")
private external fun kni_sfConvexShape_create(): NativePtr

fun sfConvexShape_copy(shape: CValuesRef<sfConvexShape>?): CPointer<sfConvexShape>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_copy(_shape)
        interpretCPointer<sfConvexShape>(res)
    }
}

@SymbolName("sfml_kni_sfConvexShape_copy")
private external fun kni_sfConvexShape_copy(shape: NativePtr): NativePtr

fun sfConvexShape_destroy(shape: CValuesRef<sfConvexShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_destroy(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_destroy")
private external fun kni_sfConvexShape_destroy(shape: NativePtr): Unit

fun sfConvexShape_setPosition(shape: CValuesRef<sfConvexShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setPosition(_shape, _position)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setPosition")
private external fun kni_sfConvexShape_setPosition(shape: NativePtr, position: NativePtr): Unit

fun sfConvexShape_setRotation(shape: CValuesRef<sfConvexShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfConvexShape_setRotation(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setRotation")
private external fun kni_sfConvexShape_setRotation(shape: NativePtr, angle: Float): Unit

fun sfConvexShape_setScale(shape: CValuesRef<sfConvexShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setScale(_shape, _scale)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setScale")
private external fun kni_sfConvexShape_setScale(shape: NativePtr, scale: NativePtr): Unit

fun sfConvexShape_setOrigin(shape: CValuesRef<sfConvexShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setOrigin(_shape, _origin)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setOrigin")
private external fun kni_sfConvexShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

fun sfConvexShape_getPosition(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getPosition")
private external fun kni_sfConvexShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_getRotation(shape: CValuesRef<sfConvexShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getRotation(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_getRotation")
private external fun kni_sfConvexShape_getRotation(shape: NativePtr): Float

fun sfConvexShape_getScale(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getScale")
private external fun kni_sfConvexShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_getOrigin(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getOrigin")
private external fun kni_sfConvexShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_move(shape: CValuesRef<sfConvexShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_move(_shape, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_move")
private external fun kni_sfConvexShape_move(shape: NativePtr, offset: NativePtr): Unit

fun sfConvexShape_rotate(shape: CValuesRef<sfConvexShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfConvexShape_rotate(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_rotate")
private external fun kni_sfConvexShape_rotate(shape: NativePtr, angle: Float): Unit

fun sfConvexShape_scale(shape: CValuesRef<sfConvexShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_scale(_shape, _factors)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_scale")
private external fun kni_sfConvexShape_scale(shape: NativePtr, factors: NativePtr): Unit

fun sfConvexShape_getTransform(shape: CValuesRef<sfConvexShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getTransform")
private external fun kni_sfConvexShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_getInverseTransform(shape: CValuesRef<sfConvexShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getInverseTransform")
private external fun kni_sfConvexShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_setTexture(shape: CValuesRef<sfConvexShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfConvexShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setTexture")
private external fun kni_sfConvexShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

fun sfConvexShape_setTextureRect(shape: CValuesRef<sfConvexShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setTextureRect(_shape, _rect)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setTextureRect")
private external fun kni_sfConvexShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

fun sfConvexShape_setFillColor(shape: CValuesRef<sfConvexShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setFillColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setFillColor")
private external fun kni_sfConvexShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

fun sfConvexShape_setOutlineColor(shape: CValuesRef<sfConvexShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setOutlineColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setOutlineColor")
private external fun kni_sfConvexShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

fun sfConvexShape_setOutlineThickness(shape: CValuesRef<sfConvexShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfConvexShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setOutlineThickness")
private external fun kni_sfConvexShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

fun sfConvexShape_getTexture(shape: CValuesRef<sfConvexShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfConvexShape_getTexture")
private external fun kni_sfConvexShape_getTexture(shape: NativePtr): NativePtr

fun sfConvexShape_getTextureRect(shape: CValuesRef<sfConvexShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getTextureRect")
private external fun kni_sfConvexShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_getFillColor(shape: CValuesRef<sfConvexShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getFillColor")
private external fun kni_sfConvexShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_getOutlineColor(shape: CValuesRef<sfConvexShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getOutlineColor")
private external fun kni_sfConvexShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_getOutlineThickness(shape: CValuesRef<sfConvexShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getOutlineThickness(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_getOutlineThickness")
private external fun kni_sfConvexShape_getOutlineThickness(shape: NativePtr): Float

fun sfConvexShape_getPointCount(shape: CValuesRef<sfConvexShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getPointCount(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_getPointCount")
private external fun kni_sfConvexShape_getPointCount(shape: NativePtr): Long

fun sfConvexShape_getPoint(shape: CValuesRef<sfConvexShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfConvexShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getPoint")
private external fun kni_sfConvexShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_setPointCount(shape: CValuesRef<sfConvexShape>?, count: size_t): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_sfConvexShape_setPointCount(_shape, _count)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setPointCount")
private external fun kni_sfConvexShape_setPointCount(shape: NativePtr, count: Long): Unit

fun sfConvexShape_setPoint(shape: CValuesRef<sfConvexShape>?, index: size_t, point: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val _point = point.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setPoint(_shape, _index, _point)
        res
    }
}

@SymbolName("sfml_kni_sfConvexShape_setPoint")
private external fun kni_sfConvexShape_setPoint(shape: NativePtr, index: Long, point: NativePtr): Unit

fun sfConvexShape_getLocalBounds(shape: CValuesRef<sfConvexShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getLocalBounds")
private external fun kni_sfConvexShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfConvexShape_getGlobalBounds(shape: CValuesRef<sfConvexShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfConvexShape_getGlobalBounds")
private external fun kni_sfConvexShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfFont_createFromFile(filename: String?): CPointer<sfFont>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFont_createFromFile(_filename)
        interpretCPointer<sfFont>(res)
    }
}

@SymbolName("sfml_kni_sfFont_createFromFile")
private external fun kni_sfFont_createFromFile(filename: NativePtr): NativePtr

fun sfFont_createFromMemory(data: COpaquePointer?, sizeInBytes: size_t): CPointer<sfFont>? {
    val _data = data.rawValue
    val _sizeInBytes = sizeInBytes
    val res = kni_sfFont_createFromMemory(_data, _sizeInBytes)
    return interpretCPointer<sfFont>(res)
}

@SymbolName("sfml_kni_sfFont_createFromMemory")
private external fun kni_sfFont_createFromMemory(data: NativePtr, sizeInBytes: Long): NativePtr

fun sfFont_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfFont>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val res = kni_sfFont_createFromStream(_stream)
        interpretCPointer<sfFont>(res)
    }
}

@SymbolName("sfml_kni_sfFont_createFromStream")
private external fun kni_sfFont_createFromStream(stream: NativePtr): NativePtr

fun sfFont_copy(font: CValuesRef<sfFont>?): CPointer<sfFont>? {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfFont_copy(_font)
        interpretCPointer<sfFont>(res)
    }
}

@SymbolName("sfml_kni_sfFont_copy")
private external fun kni_sfFont_copy(font: NativePtr): NativePtr

fun sfFont_destroy(font: CValuesRef<sfFont>?): Unit {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfFont_destroy(_font)
        res
    }
}

@SymbolName("sfml_kni_sfFont_destroy")
private external fun kni_sfFont_destroy(font: NativePtr): Unit

fun sfFont_getGlyph(font: CValuesRef<sfFont>?, codePoint: sfUint32, characterSize: Int, bold: sfBool): CValue<sfGlyph> {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _codePoint = codePoint
        val _characterSize = characterSize
        val _bold = bold
        val res = kni_sfFont_getGlyph(_font, _codePoint, _characterSize, _bold, alloc<sfGlyph>().rawPtr)
        interpretPointed<sfGlyph>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfFont_getGlyph")
private external fun kni_sfFont_getGlyph(font: NativePtr, codePoint: Int, characterSize: Int, bold: Int, retValPlacement: NativePtr): NativePtr

fun sfFont_getKerning(font: CValuesRef<sfFont>?, first: sfUint32, second: sfUint32, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _first = first
        val _second = second
        val _characterSize = characterSize
        val res = kni_sfFont_getKerning(_font, _first, _second, _characterSize)
        res
    }
}

@SymbolName("sfml_kni_sfFont_getKerning")
private external fun kni_sfFont_getKerning(font: NativePtr, first: Int, second: Int, characterSize: Int): Float

fun sfFont_getLineSpacing(font: CValuesRef<sfFont>?, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getLineSpacing(_font, _characterSize)
        res
    }
}

@SymbolName("sfml_kni_sfFont_getLineSpacing")
private external fun kni_sfFont_getLineSpacing(font: NativePtr, characterSize: Int): Float

fun sfFont_getUnderlinePosition(font: CValuesRef<sfFont>?, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getUnderlinePosition(_font, _characterSize)
        res
    }
}

@SymbolName("sfml_kni_sfFont_getUnderlinePosition")
private external fun kni_sfFont_getUnderlinePosition(font: NativePtr, characterSize: Int): Float

fun sfFont_getUnderlineThickness(font: CValuesRef<sfFont>?, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getUnderlineThickness(_font, _characterSize)
        res
    }
}

@SymbolName("sfml_kni_sfFont_getUnderlineThickness")
private external fun kni_sfFont_getUnderlineThickness(font: NativePtr, characterSize: Int): Float

fun sfFont_getTexture(font: CValuesRef<sfFont>?, characterSize: Int): CPointer<sfTexture>? {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getTexture(_font, _characterSize)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfFont_getTexture")
private external fun kni_sfFont_getTexture(font: NativePtr, characterSize: Int): NativePtr

fun sfFont_getInfo(font: CValuesRef<sfFont>?): CValue<sfFontInfo> {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfFont_getInfo(_font, alloc<sfFontInfo>().rawPtr)
        interpretPointed<sfFontInfo>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfFont_getInfo")
private external fun kni_sfFont_getInfo(font: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfImage_create(width: Int, height: Int): CPointer<sfImage>? {
    val _width = width
    val _height = height
    val res = kni_sfImage_create(_width, _height)
    return interpretCPointer<sfImage>(res)
}

@SymbolName("sfml_kni_sfImage_create")
private external fun kni_sfImage_create(width: Int, height: Int): NativePtr

fun sfImage_createFromColor(width: Int, height: Int, color: CValue<sfColor>): CPointer<sfImage>? {
    return memScoped {
        val _width = width
        val _height = height
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromColor(_width, _height, _color)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("sfml_kni_sfImage_createFromColor")
private external fun kni_sfImage_createFromColor(width: Int, height: Int, color: NativePtr): NativePtr

fun sfImage_createFromPixels(width: Int, height: Int, pixels: CValuesRef<sfUint8Var>?): CPointer<sfImage>? {
    return memScoped {
        val _width = width
        val _height = height
        val _pixels = pixels?.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromPixels(_width, _height, _pixels)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("sfml_kni_sfImage_createFromPixels")
private external fun kni_sfImage_createFromPixels(width: Int, height: Int, pixels: NativePtr): NativePtr

fun sfImage_createFromFile(filename: String?): CPointer<sfImage>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromFile(_filename)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("sfml_kni_sfImage_createFromFile")
private external fun kni_sfImage_createFromFile(filename: NativePtr): NativePtr

fun sfImage_createFromMemory(data: COpaquePointer?, size: size_t): CPointer<sfImage>? {
    val _data = data.rawValue
    val _size = size
    val res = kni_sfImage_createFromMemory(_data, _size)
    return interpretCPointer<sfImage>(res)
}

@SymbolName("sfml_kni_sfImage_createFromMemory")
private external fun kni_sfImage_createFromMemory(data: NativePtr, size: Long): NativePtr

fun sfImage_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfImage>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromStream(_stream)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("sfml_kni_sfImage_createFromStream")
private external fun kni_sfImage_createFromStream(stream: NativePtr): NativePtr

fun sfImage_copy(image: CValuesRef<sfImage>?): CPointer<sfImage>? {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_copy(_image)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("sfml_kni_sfImage_copy")
private external fun kni_sfImage_copy(image: NativePtr): NativePtr

fun sfImage_destroy(image: CValuesRef<sfImage>?): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_destroy(_image)
        res
    }
}

@SymbolName("sfml_kni_sfImage_destroy")
private external fun kni_sfImage_destroy(image: NativePtr): Unit

fun sfImage_saveToFile(image: CValuesRef<sfImage>?, filename: String?): sfBool {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfImage_saveToFile(_image, _filename)
        res
    }
}

@SymbolName("sfml_kni_sfImage_saveToFile")
private external fun kni_sfImage_saveToFile(image: NativePtr, filename: NativePtr): Int

fun sfImage_getSize(image: CValuesRef<sfImage>?): CValue<sfVector2u> {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_getSize(_image, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfImage_getSize")
private external fun kni_sfImage_getSize(image: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfImage_createMaskFromColor(image: CValuesRef<sfImage>?, color: CValue<sfColor>, alpha: sfUint8): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val _alpha = alpha
        val res = kni_sfImage_createMaskFromColor(_image, _color, _alpha)
        res
    }
}

@SymbolName("sfml_kni_sfImage_createMaskFromColor")
private external fun kni_sfImage_createMaskFromColor(image: NativePtr, color: NativePtr, alpha: Byte): Unit

fun sfImage_copyImage(image: CValuesRef<sfImage>?, source: CValuesRef<sfImage>?, destX: Int, destY: Int, sourceRect: CValue<sfIntRect>, applyAlpha: sfBool): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _source = source?.getPointer(memScope).rawValue
        val _destX = destX
        val _destY = destY
        val _sourceRect = sourceRect.getPointer(memScope).rawValue
        val _applyAlpha = applyAlpha
        val res = kni_sfImage_copyImage(_image, _source, _destX, _destY, _sourceRect, _applyAlpha)
        res
    }
}

@SymbolName("sfml_kni_sfImage_copyImage")
private external fun kni_sfImage_copyImage(image: NativePtr, source: NativePtr, destX: Int, destY: Int, sourceRect: NativePtr, applyAlpha: Int): Unit

fun sfImage_setPixel(image: CValuesRef<sfImage>?, x: Int, y: Int, color: CValue<sfColor>): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfImage_setPixel(_image, _x, _y, _color)
        res
    }
}

@SymbolName("sfml_kni_sfImage_setPixel")
private external fun kni_sfImage_setPixel(image: NativePtr, x: Int, y: Int, color: NativePtr): Unit

fun sfImage_getPixel(image: CValuesRef<sfImage>?, x: Int, y: Int): CValue<sfColor> {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfImage_getPixel(_image, _x, _y, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfImage_getPixel")
private external fun kni_sfImage_getPixel(image: NativePtr, x: Int, y: Int, retValPlacement: NativePtr): NativePtr

fun sfImage_getPixelsPtr(image: CValuesRef<sfImage>?): CPointer<sfUint8Var>? {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_getPixelsPtr(_image)
        interpretCPointer<sfUint8Var>(res)
    }
}

@SymbolName("sfml_kni_sfImage_getPixelsPtr")
private external fun kni_sfImage_getPixelsPtr(image: NativePtr): NativePtr

fun sfImage_flipHorizontally(image: CValuesRef<sfImage>?): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_flipHorizontally(_image)
        res
    }
}

@SymbolName("sfml_kni_sfImage_flipHorizontally")
private external fun kni_sfImage_flipHorizontally(image: NativePtr): Unit

fun sfImage_flipVertically(image: CValuesRef<sfImage>?): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_flipVertically(_image)
        res
    }
}

@SymbolName("sfml_kni_sfImage_flipVertically")
private external fun kni_sfImage_flipVertically(image: NativePtr): Unit

fun sfRectangleShape_create(): CPointer<sfRectangleShape>? {
    val res = kni_sfRectangleShape_create()
    return interpretCPointer<sfRectangleShape>(res)
}

@SymbolName("sfml_kni_sfRectangleShape_create")
private external fun kni_sfRectangleShape_create(): NativePtr

fun sfRectangleShape_copy(shape: CValuesRef<sfRectangleShape>?): CPointer<sfRectangleShape>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_copy(_shape)
        interpretCPointer<sfRectangleShape>(res)
    }
}

@SymbolName("sfml_kni_sfRectangleShape_copy")
private external fun kni_sfRectangleShape_copy(shape: NativePtr): NativePtr

fun sfRectangleShape_destroy(shape: CValuesRef<sfRectangleShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_destroy(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_destroy")
private external fun kni_sfRectangleShape_destroy(shape: NativePtr): Unit

fun sfRectangleShape_setPosition(shape: CValuesRef<sfRectangleShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setPosition(_shape, _position)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setPosition")
private external fun kni_sfRectangleShape_setPosition(shape: NativePtr, position: NativePtr): Unit

fun sfRectangleShape_setRotation(shape: CValuesRef<sfRectangleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfRectangleShape_setRotation(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setRotation")
private external fun kni_sfRectangleShape_setRotation(shape: NativePtr, angle: Float): Unit

fun sfRectangleShape_setScale(shape: CValuesRef<sfRectangleShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setScale(_shape, _scale)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setScale")
private external fun kni_sfRectangleShape_setScale(shape: NativePtr, scale: NativePtr): Unit

fun sfRectangleShape_setOrigin(shape: CValuesRef<sfRectangleShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setOrigin(_shape, _origin)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setOrigin")
private external fun kni_sfRectangleShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

fun sfRectangleShape_getPosition(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getPosition")
private external fun kni_sfRectangleShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getRotation(shape: CValuesRef<sfRectangleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getRotation(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getRotation")
private external fun kni_sfRectangleShape_getRotation(shape: NativePtr): Float

fun sfRectangleShape_getScale(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getScale")
private external fun kni_sfRectangleShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getOrigin(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getOrigin")
private external fun kni_sfRectangleShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_move(shape: CValuesRef<sfRectangleShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_move(_shape, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_move")
private external fun kni_sfRectangleShape_move(shape: NativePtr, offset: NativePtr): Unit

fun sfRectangleShape_rotate(shape: CValuesRef<sfRectangleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfRectangleShape_rotate(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_rotate")
private external fun kni_sfRectangleShape_rotate(shape: NativePtr, angle: Float): Unit

fun sfRectangleShape_scale(shape: CValuesRef<sfRectangleShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_scale(_shape, _factors)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_scale")
private external fun kni_sfRectangleShape_scale(shape: NativePtr, factors: NativePtr): Unit

fun sfRectangleShape_getTransform(shape: CValuesRef<sfRectangleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getTransform")
private external fun kni_sfRectangleShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getInverseTransform(shape: CValuesRef<sfRectangleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getInverseTransform")
private external fun kni_sfRectangleShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_setTexture(shape: CValuesRef<sfRectangleShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfRectangleShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setTexture")
private external fun kni_sfRectangleShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

fun sfRectangleShape_setTextureRect(shape: CValuesRef<sfRectangleShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setTextureRect(_shape, _rect)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setTextureRect")
private external fun kni_sfRectangleShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

fun sfRectangleShape_setFillColor(shape: CValuesRef<sfRectangleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setFillColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setFillColor")
private external fun kni_sfRectangleShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

fun sfRectangleShape_setOutlineColor(shape: CValuesRef<sfRectangleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setOutlineColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setOutlineColor")
private external fun kni_sfRectangleShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

fun sfRectangleShape_setOutlineThickness(shape: CValuesRef<sfRectangleShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfRectangleShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setOutlineThickness")
private external fun kni_sfRectangleShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

fun sfRectangleShape_getTexture(shape: CValuesRef<sfRectangleShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getTexture")
private external fun kni_sfRectangleShape_getTexture(shape: NativePtr): NativePtr

fun sfRectangleShape_getTextureRect(shape: CValuesRef<sfRectangleShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getTextureRect")
private external fun kni_sfRectangleShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getFillColor(shape: CValuesRef<sfRectangleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getFillColor")
private external fun kni_sfRectangleShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getOutlineColor(shape: CValuesRef<sfRectangleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getOutlineColor")
private external fun kni_sfRectangleShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getOutlineThickness(shape: CValuesRef<sfRectangleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getOutlineThickness(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getOutlineThickness")
private external fun kni_sfRectangleShape_getOutlineThickness(shape: NativePtr): Float

fun sfRectangleShape_getPointCount(shape: CValuesRef<sfRectangleShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getPointCount(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getPointCount")
private external fun kni_sfRectangleShape_getPointCount(shape: NativePtr): Long

fun sfRectangleShape_getPoint(shape: CValuesRef<sfRectangleShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfRectangleShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getPoint")
private external fun kni_sfRectangleShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_setSize(shape: CValuesRef<sfRectangleShape>?, size: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setSize(_shape, _size)
        res
    }
}

@SymbolName("sfml_kni_sfRectangleShape_setSize")
private external fun kni_sfRectangleShape_setSize(shape: NativePtr, size: NativePtr): Unit

fun sfRectangleShape_getSize(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getSize(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getSize")
private external fun kni_sfRectangleShape_getSize(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getLocalBounds(shape: CValuesRef<sfRectangleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getLocalBounds")
private external fun kni_sfRectangleShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRectangleShape_getGlobalBounds(shape: CValuesRef<sfRectangleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRectangleShape_getGlobalBounds")
private external fun kni_sfRectangleShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderTexture_create(width: Int, height: Int, depthBuffer: sfBool): CPointer<sfRenderTexture>? {
    val _width = width
    val _height = height
    val _depthBuffer = depthBuffer
    val res = kni_sfRenderTexture_create(_width, _height, _depthBuffer)
    return interpretCPointer<sfRenderTexture>(res)
}

@SymbolName("sfml_kni_sfRenderTexture_create")
private external fun kni_sfRenderTexture_create(width: Int, height: Int, depthBuffer: Int): NativePtr

fun sfRenderTexture_destroy(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_destroy(_renderTexture)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_destroy")
private external fun kni_sfRenderTexture_destroy(renderTexture: NativePtr): Unit

fun sfRenderTexture_getSize(renderTexture: CValuesRef<sfRenderTexture>?): CValue<sfVector2u> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getSize(_renderTexture, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderTexture_getSize")
private external fun kni_sfRenderTexture_getSize(renderTexture: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderTexture_setActive(renderTexture: CValuesRef<sfRenderTexture>?, active: sfBool): sfBool {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfRenderTexture_setActive(_renderTexture, _active)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_setActive")
private external fun kni_sfRenderTexture_setActive(renderTexture: NativePtr, active: Int): Int

fun sfRenderTexture_display(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_display(_renderTexture)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_display")
private external fun kni_sfRenderTexture_display(renderTexture: NativePtr): Unit

fun sfRenderTexture_clear(renderTexture: CValuesRef<sfRenderTexture>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_clear(_renderTexture, _color)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_clear")
private external fun kni_sfRenderTexture_clear(renderTexture: NativePtr, color: NativePtr): Unit

fun sfRenderTexture_setView(renderTexture: CValuesRef<sfRenderTexture>?, view: CValuesRef<sfView>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_setView(_renderTexture, _view)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_setView")
private external fun kni_sfRenderTexture_setView(renderTexture: NativePtr, view: NativePtr): Unit

fun sfRenderTexture_getView(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfView>? {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getView(_renderTexture)
        interpretCPointer<sfView>(res)
    }
}

@SymbolName("sfml_kni_sfRenderTexture_getView")
private external fun kni_sfRenderTexture_getView(renderTexture: NativePtr): NativePtr

fun sfRenderTexture_getDefaultView(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfView>? {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getDefaultView(_renderTexture)
        interpretCPointer<sfView>(res)
    }
}

@SymbolName("sfml_kni_sfRenderTexture_getDefaultView")
private external fun kni_sfRenderTexture_getDefaultView(renderTexture: NativePtr): NativePtr

fun sfRenderTexture_getViewport(renderTexture: CValuesRef<sfRenderTexture>?, view: CValuesRef<sfView>?): CValue<sfIntRect> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getViewport(_renderTexture, _view, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderTexture_getViewport")
private external fun kni_sfRenderTexture_getViewport(renderTexture: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderTexture_mapPixelToCoords(renderTexture: CValuesRef<sfRenderTexture>?, point: CValue<sfVector2i>, view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_mapPixelToCoords(_renderTexture, _point, _view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderTexture_mapPixelToCoords")
private external fun kni_sfRenderTexture_mapPixelToCoords(renderTexture: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderTexture_mapCoordsToPixel(renderTexture: CValuesRef<sfRenderTexture>?, point: CValue<sfVector2f>, view: CValuesRef<sfView>?): CValue<sfVector2i> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_mapCoordsToPixel(_renderTexture, _point, _view, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderTexture_mapCoordsToPixel")
private external fun kni_sfRenderTexture_mapCoordsToPixel(renderTexture: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderTexture_drawSprite(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfSprite>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawSprite(_renderTexture, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawSprite")
private external fun kni_sfRenderTexture_drawSprite(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderTexture_drawText(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfText>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawText(_renderTexture, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawText")
private external fun kni_sfRenderTexture_drawText(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderTexture_drawShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawShape(_renderTexture, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawShape")
private external fun kni_sfRenderTexture_drawShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderTexture_drawCircleShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfCircleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawCircleShape(_renderTexture, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawCircleShape")
private external fun kni_sfRenderTexture_drawCircleShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderTexture_drawConvexShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfConvexShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawConvexShape(_renderTexture, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawConvexShape")
private external fun kni_sfRenderTexture_drawConvexShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderTexture_drawRectangleShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfRectangleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawRectangleShape(_renderTexture, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawRectangleShape")
private external fun kni_sfRenderTexture_drawRectangleShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderTexture_drawVertexArray(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfVertexArray>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawVertexArray(_renderTexture, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawVertexArray")
private external fun kni_sfRenderTexture_drawVertexArray(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderTexture_drawPrimitives(renderTexture: CValuesRef<sfRenderTexture>?, vertices: CValuesRef<sfVertex>?, vertexCount: size_t, type: sfPrimitiveType, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _vertices = vertices?.getPointer(memScope).rawValue
        val _vertexCount = vertexCount
        val _type = type.value
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawPrimitives(_renderTexture, _vertices, _vertexCount, _type, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_drawPrimitives")
private external fun kni_sfRenderTexture_drawPrimitives(renderTexture: NativePtr, vertices: NativePtr, vertexCount: Long, type: Int, states: NativePtr): Unit

fun sfRenderTexture_pushGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_pushGLStates(_renderTexture)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_pushGLStates")
private external fun kni_sfRenderTexture_pushGLStates(renderTexture: NativePtr): Unit

fun sfRenderTexture_popGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_popGLStates(_renderTexture)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_popGLStates")
private external fun kni_sfRenderTexture_popGLStates(renderTexture: NativePtr): Unit

fun sfRenderTexture_resetGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_resetGLStates(_renderTexture)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_resetGLStates")
private external fun kni_sfRenderTexture_resetGLStates(renderTexture: NativePtr): Unit

fun sfRenderTexture_getTexture(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfTexture>? {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getTexture(_renderTexture)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfRenderTexture_getTexture")
private external fun kni_sfRenderTexture_getTexture(renderTexture: NativePtr): NativePtr

fun sfRenderTexture_setSmooth(renderTexture: CValuesRef<sfRenderTexture>?, smooth: sfBool): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _smooth = smooth
        val res = kni_sfRenderTexture_setSmooth(_renderTexture, _smooth)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_setSmooth")
private external fun kni_sfRenderTexture_setSmooth(renderTexture: NativePtr, smooth: Int): Unit

fun sfRenderTexture_isSmooth(renderTexture: CValuesRef<sfRenderTexture>?): sfBool {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_isSmooth(_renderTexture)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_isSmooth")
private external fun kni_sfRenderTexture_isSmooth(renderTexture: NativePtr): Int

fun sfRenderTexture_setRepeated(renderTexture: CValuesRef<sfRenderTexture>?, repeated: sfBool): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _repeated = repeated
        val res = kni_sfRenderTexture_setRepeated(_renderTexture, _repeated)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_setRepeated")
private external fun kni_sfRenderTexture_setRepeated(renderTexture: NativePtr, repeated: Int): Unit

fun sfRenderTexture_isRepeated(renderTexture: CValuesRef<sfRenderTexture>?): sfBool {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_isRepeated(_renderTexture)
        res
    }
}

@SymbolName("sfml_kni_sfRenderTexture_isRepeated")
private external fun kni_sfRenderTexture_isRepeated(renderTexture: NativePtr): Int

fun sfRenderWindow_create(mode: CValue<sfVideoMode>, title: String?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_create(_mode, _title, _style, _settings)
        interpretCPointer<sfRenderWindow>(res)
    }
}

@SymbolName("sfml_kni_sfRenderWindow_create")
private external fun kni_sfRenderWindow_create(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

fun sfRenderWindow_createUnicode(mode: CValue<sfVideoMode>, title: CValuesRef<sfUint32Var>?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_createUnicode(_mode, _title, _style, _settings)
        interpretCPointer<sfRenderWindow>(res)
    }
}

@SymbolName("sfml_kni_sfRenderWindow_createUnicode")
private external fun kni_sfRenderWindow_createUnicode(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

fun sfRenderWindow_createFromHandle(handle: sfWindowHandle, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    return memScoped {
        val _handle = handle
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_createFromHandle(_handle, _settings)
        interpretCPointer<sfRenderWindow>(res)
    }
}

@SymbolName("sfml_kni_sfRenderWindow_createFromHandle")
private external fun kni_sfRenderWindow_createFromHandle(handle: Long, settings: NativePtr): NativePtr

fun sfRenderWindow_destroy(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_destroy(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_destroy")
private external fun kni_sfRenderWindow_destroy(renderWindow: NativePtr): Unit

fun sfRenderWindow_close(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_close(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_close")
private external fun kni_sfRenderWindow_close(renderWindow: NativePtr): Unit

fun sfRenderWindow_isOpen(renderWindow: CValuesRef<sfRenderWindow>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_isOpen(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_isOpen")
private external fun kni_sfRenderWindow_isOpen(renderWindow: NativePtr): Int

fun sfRenderWindow_getSettings(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfContextSettings> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getSettings(_renderWindow, alloc<sfContextSettings>().rawPtr)
        interpretPointed<sfContextSettings>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderWindow_getSettings")
private external fun kni_sfRenderWindow_getSettings(renderWindow: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderWindow_pollEvent(renderWindow: CValuesRef<sfRenderWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_pollEvent(_renderWindow, _event)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_pollEvent")
private external fun kni_sfRenderWindow_pollEvent(renderWindow: NativePtr, event: NativePtr): Int

fun sfRenderWindow_waitEvent(renderWindow: CValuesRef<sfRenderWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_waitEvent(_renderWindow, _event)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_waitEvent")
private external fun kni_sfRenderWindow_waitEvent(renderWindow: NativePtr, event: NativePtr): Int

fun sfRenderWindow_getPosition(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getPosition(_renderWindow, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderWindow_getPosition")
private external fun kni_sfRenderWindow_getPosition(renderWindow: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderWindow_setPosition(renderWindow: CValuesRef<sfRenderWindow>?, position: CValue<sfVector2i>): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setPosition(_renderWindow, _position)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setPosition")
private external fun kni_sfRenderWindow_setPosition(renderWindow: NativePtr, position: NativePtr): Unit

fun sfRenderWindow_getSize(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfVector2u> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getSize(_renderWindow, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderWindow_getSize")
private external fun kni_sfRenderWindow_getSize(renderWindow: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderWindow_setSize(renderWindow: CValuesRef<sfRenderWindow>?, size: CValue<sfVector2u>): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setSize(_renderWindow, _size)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setSize")
private external fun kni_sfRenderWindow_setSize(renderWindow: NativePtr, size: NativePtr): Unit

fun sfRenderWindow_setTitle(renderWindow: CValuesRef<sfRenderWindow>?, title: String?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setTitle(_renderWindow, _title)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setTitle")
private external fun kni_sfRenderWindow_setTitle(renderWindow: NativePtr, title: NativePtr): Unit

fun sfRenderWindow_setUnicodeTitle(renderWindow: CValuesRef<sfRenderWindow>?, title: CValuesRef<sfUint32Var>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setUnicodeTitle(_renderWindow, _title)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setUnicodeTitle")
private external fun kni_sfRenderWindow_setUnicodeTitle(renderWindow: NativePtr, title: NativePtr): Unit

fun sfRenderWindow_setIcon(renderWindow: CValuesRef<sfRenderWindow>?, width: Int, height: Int, pixels: CValuesRef<sfUint8Var>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _width = width
        val _height = height
        val _pixels = pixels?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setIcon(_renderWindow, _width, _height, _pixels)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setIcon")
private external fun kni_sfRenderWindow_setIcon(renderWindow: NativePtr, width: Int, height: Int, pixels: NativePtr): Unit

fun sfRenderWindow_setVisible(renderWindow: CValuesRef<sfRenderWindow>?, visible: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _visible = visible
        val res = kni_sfRenderWindow_setVisible(_renderWindow, _visible)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setVisible")
private external fun kni_sfRenderWindow_setVisible(renderWindow: NativePtr, visible: Int): Unit

fun sfRenderWindow_setMouseCursorVisible(renderWindow: CValuesRef<sfRenderWindow>?, show: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _show = show
        val res = kni_sfRenderWindow_setMouseCursorVisible(_renderWindow, _show)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setMouseCursorVisible")
private external fun kni_sfRenderWindow_setMouseCursorVisible(renderWindow: NativePtr, show: Int): Unit

fun sfRenderWindow_setVerticalSyncEnabled(renderWindow: CValuesRef<sfRenderWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfRenderWindow_setVerticalSyncEnabled(_renderWindow, _enabled)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setVerticalSyncEnabled")
private external fun kni_sfRenderWindow_setVerticalSyncEnabled(renderWindow: NativePtr, enabled: Int): Unit

fun sfRenderWindow_setKeyRepeatEnabled(renderWindow: CValuesRef<sfRenderWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfRenderWindow_setKeyRepeatEnabled(_renderWindow, _enabled)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setKeyRepeatEnabled")
private external fun kni_sfRenderWindow_setKeyRepeatEnabled(renderWindow: NativePtr, enabled: Int): Unit

fun sfRenderWindow_setActive(renderWindow: CValuesRef<sfRenderWindow>?, active: sfBool): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfRenderWindow_setActive(_renderWindow, _active)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setActive")
private external fun kni_sfRenderWindow_setActive(renderWindow: NativePtr, active: Int): Int

fun sfRenderWindow_requestFocus(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_requestFocus(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_requestFocus")
private external fun kni_sfRenderWindow_requestFocus(renderWindow: NativePtr): Unit

fun sfRenderWindow_hasFocus(renderWindow: CValuesRef<sfRenderWindow>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_hasFocus(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_hasFocus")
private external fun kni_sfRenderWindow_hasFocus(renderWindow: NativePtr): Int

fun sfRenderWindow_display(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_display(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_display")
private external fun kni_sfRenderWindow_display(renderWindow: NativePtr): Unit

fun sfRenderWindow_setFramerateLimit(renderWindow: CValuesRef<sfRenderWindow>?, limit: Int): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _limit = limit
        val res = kni_sfRenderWindow_setFramerateLimit(_renderWindow, _limit)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setFramerateLimit")
private external fun kni_sfRenderWindow_setFramerateLimit(renderWindow: NativePtr, limit: Int): Unit

fun sfRenderWindow_setJoystickThreshold(renderWindow: CValuesRef<sfRenderWindow>?, threshold: Float): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _threshold = threshold
        val res = kni_sfRenderWindow_setJoystickThreshold(_renderWindow, _threshold)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setJoystickThreshold")
private external fun kni_sfRenderWindow_setJoystickThreshold(renderWindow: NativePtr, threshold: Float): Unit

fun sfRenderWindow_getSystemHandle(renderWindow: CValuesRef<sfRenderWindow>?): sfWindowHandle {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getSystemHandle(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_getSystemHandle")
private external fun kni_sfRenderWindow_getSystemHandle(renderWindow: NativePtr): Long

fun sfRenderWindow_clear(renderWindow: CValuesRef<sfRenderWindow>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_clear(_renderWindow, _color)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_clear")
private external fun kni_sfRenderWindow_clear(renderWindow: NativePtr, color: NativePtr): Unit

fun sfRenderWindow_setView(renderWindow: CValuesRef<sfRenderWindow>?, view: CValuesRef<sfView>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setView(_renderWindow, _view)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_setView")
private external fun kni_sfRenderWindow_setView(renderWindow: NativePtr, view: NativePtr): Unit

fun sfRenderWindow_getView(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfView>? {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getView(_renderWindow)
        interpretCPointer<sfView>(res)
    }
}

@SymbolName("sfml_kni_sfRenderWindow_getView")
private external fun kni_sfRenderWindow_getView(renderWindow: NativePtr): NativePtr

fun sfRenderWindow_getDefaultView(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfView>? {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getDefaultView(_renderWindow)
        interpretCPointer<sfView>(res)
    }
}

@SymbolName("sfml_kni_sfRenderWindow_getDefaultView")
private external fun kni_sfRenderWindow_getDefaultView(renderWindow: NativePtr): NativePtr

fun sfRenderWindow_getViewport(renderWindow: CValuesRef<sfRenderWindow>?, view: CValuesRef<sfView>?): CValue<sfIntRect> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getViewport(_renderWindow, _view, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderWindow_getViewport")
private external fun kni_sfRenderWindow_getViewport(renderWindow: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderWindow_mapPixelToCoords(renderWindow: CValuesRef<sfRenderWindow>?, point: CValue<sfVector2i>, view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_mapPixelToCoords(_renderWindow, _point, _view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderWindow_mapPixelToCoords")
private external fun kni_sfRenderWindow_mapPixelToCoords(renderWindow: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderWindow_mapCoordsToPixel(renderWindow: CValuesRef<sfRenderWindow>?, point: CValue<sfVector2f>, view: CValuesRef<sfView>?): CValue<sfVector2i> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_mapCoordsToPixel(_renderWindow, _point, _view, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfRenderWindow_mapCoordsToPixel")
private external fun kni_sfRenderWindow_mapCoordsToPixel(renderWindow: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfRenderWindow_drawSprite(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfSprite>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawSprite(_renderWindow, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawSprite")
private external fun kni_sfRenderWindow_drawSprite(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderWindow_drawText(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfText>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawText(_renderWindow, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawText")
private external fun kni_sfRenderWindow_drawText(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderWindow_drawShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawShape(_renderWindow, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawShape")
private external fun kni_sfRenderWindow_drawShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderWindow_drawCircleShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfCircleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawCircleShape(_renderWindow, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawCircleShape")
private external fun kni_sfRenderWindow_drawCircleShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderWindow_drawConvexShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfConvexShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawConvexShape(_renderWindow, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawConvexShape")
private external fun kni_sfRenderWindow_drawConvexShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderWindow_drawRectangleShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfRectangleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawRectangleShape(_renderWindow, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawRectangleShape")
private external fun kni_sfRenderWindow_drawRectangleShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderWindow_drawVertexArray(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfVertexArray>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawVertexArray(_renderWindow, _object, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawVertexArray")
private external fun kni_sfRenderWindow_drawVertexArray(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

fun sfRenderWindow_drawPrimitives(renderWindow: CValuesRef<sfRenderWindow>?, vertices: CValuesRef<sfVertex>?, vertexCount: size_t, type: sfPrimitiveType, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _vertices = vertices?.getPointer(memScope).rawValue
        val _vertexCount = vertexCount
        val _type = type.value
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawPrimitives(_renderWindow, _vertices, _vertexCount, _type, _states)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_drawPrimitives")
private external fun kni_sfRenderWindow_drawPrimitives(renderWindow: NativePtr, vertices: NativePtr, vertexCount: Long, type: Int, states: NativePtr): Unit

fun sfRenderWindow_pushGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_pushGLStates(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_pushGLStates")
private external fun kni_sfRenderWindow_pushGLStates(renderWindow: NativePtr): Unit

fun sfRenderWindow_popGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_popGLStates(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_popGLStates")
private external fun kni_sfRenderWindow_popGLStates(renderWindow: NativePtr): Unit

fun sfRenderWindow_resetGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_resetGLStates(_renderWindow)
        res
    }
}

@SymbolName("sfml_kni_sfRenderWindow_resetGLStates")
private external fun kni_sfRenderWindow_resetGLStates(renderWindow: NativePtr): Unit

fun sfRenderWindow_capture(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfImage>? {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_capture(_renderWindow)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("sfml_kni_sfRenderWindow_capture")
private external fun kni_sfRenderWindow_capture(renderWindow: NativePtr): NativePtr

fun sfMouse_getPositionRenderWindow(relativeTo: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_getPositionRenderWindow(_relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfMouse_getPositionRenderWindow")
private external fun kni_sfMouse_getPositionRenderWindow(relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfMouse_setPositionRenderWindow(position: CValue<sfVector2i>, relativeTo: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _position = position.getPointer(memScope).rawValue
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_setPositionRenderWindow(_position, _relativeTo)
        res
    }
}

@SymbolName("sfml_kni_sfMouse_setPositionRenderWindow")
private external fun kni_sfMouse_setPositionRenderWindow(position: NativePtr, relativeTo: NativePtr): Unit

fun sfTouch_getPositionRenderWindow(finger: Int, relativeTo: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _finger = finger
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfTouch_getPositionRenderWindow(_finger, _relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTouch_getPositionRenderWindow")
private external fun kni_sfTouch_getPositionRenderWindow(finger: Int, relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShader_createFromFile(vertexShaderFilename: String?, fragmentShaderFilename: String?): CPointer<sfShader>? {
    return memScoped {
        val _vertexShaderFilename = vertexShaderFilename?.cstr?.getPointer(memScope).rawValue
        val _fragmentShaderFilename = fragmentShaderFilename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfShader_createFromFile(_vertexShaderFilename, _fragmentShaderFilename)
        interpretCPointer<sfShader>(res)
    }
}

@SymbolName("sfml_kni_sfShader_createFromFile")
private external fun kni_sfShader_createFromFile(vertexShaderFilename: NativePtr, fragmentShaderFilename: NativePtr): NativePtr

fun sfShader_createFromMemory(vertexShader: String?, fragmentShader: String?): CPointer<sfShader>? {
    return memScoped {
        val _vertexShader = vertexShader?.cstr?.getPointer(memScope).rawValue
        val _fragmentShader = fragmentShader?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfShader_createFromMemory(_vertexShader, _fragmentShader)
        interpretCPointer<sfShader>(res)
    }
}

@SymbolName("sfml_kni_sfShader_createFromMemory")
private external fun kni_sfShader_createFromMemory(vertexShader: NativePtr, fragmentShader: NativePtr): NativePtr

fun sfShader_createFromStream(vertexShaderStream: CValuesRef<sfInputStream>?, fragmentShaderStream: CValuesRef<sfInputStream>?): CPointer<sfShader>? {
    return memScoped {
        val _vertexShaderStream = vertexShaderStream?.getPointer(memScope).rawValue
        val _fragmentShaderStream = fragmentShaderStream?.getPointer(memScope).rawValue
        val res = kni_sfShader_createFromStream(_vertexShaderStream, _fragmentShaderStream)
        interpretCPointer<sfShader>(res)
    }
}

@SymbolName("sfml_kni_sfShader_createFromStream")
private external fun kni_sfShader_createFromStream(vertexShaderStream: NativePtr, fragmentShaderStream: NativePtr): NativePtr

fun sfShader_destroy(shader: CValuesRef<sfShader>?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val res = kni_sfShader_destroy(_shader)
        res
    }
}

@SymbolName("sfml_kni_sfShader_destroy")
private external fun kni_sfShader_destroy(shader: NativePtr): Unit

fun sfShader_setFloatParameter(shader: CValuesRef<sfShader>?, name: String?, x: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val res = kni_sfShader_setFloatParameter(_shader, _name, _x)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setFloatParameter")
private external fun kni_sfShader_setFloatParameter(shader: NativePtr, name: NativePtr, x: Float): Unit

fun sfShader_setFloat2Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfShader_setFloat2Parameter(_shader, _name, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setFloat2Parameter")
private external fun kni_sfShader_setFloat2Parameter(shader: NativePtr, name: NativePtr, x: Float, y: Float): Unit

fun sfShader_setFloat3Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float, z: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _z = z
        val res = kni_sfShader_setFloat3Parameter(_shader, _name, _x, _y, _z)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setFloat3Parameter")
private external fun kni_sfShader_setFloat3Parameter(shader: NativePtr, name: NativePtr, x: Float, y: Float, z: Float): Unit

fun sfShader_setFloat4Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float, z: Float, w: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _z = z
        val _w = w
        val res = kni_sfShader_setFloat4Parameter(_shader, _name, _x, _y, _z, _w)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setFloat4Parameter")
private external fun kni_sfShader_setFloat4Parameter(shader: NativePtr, name: NativePtr, x: Float, y: Float, z: Float, w: Float): Unit

fun sfShader_setVector2Parameter(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _vector = vector.getPointer(memScope).rawValue
        val res = kni_sfShader_setVector2Parameter(_shader, _name, _vector)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setVector2Parameter")
private external fun kni_sfShader_setVector2Parameter(shader: NativePtr, name: NativePtr, vector: NativePtr): Unit

fun sfShader_setVector3Parameter(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfVector3f>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _vector = vector.getPointer(memScope).rawValue
        val res = kni_sfShader_setVector3Parameter(_shader, _name, _vector)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setVector3Parameter")
private external fun kni_sfShader_setVector3Parameter(shader: NativePtr, name: NativePtr, vector: NativePtr): Unit

fun sfShader_setColorParameter(shader: CValuesRef<sfShader>?, name: String?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfShader_setColorParameter(_shader, _name, _color)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setColorParameter")
private external fun kni_sfShader_setColorParameter(shader: NativePtr, name: NativePtr, color: NativePtr): Unit

fun sfShader_setTransformParameter(shader: CValuesRef<sfShader>?, name: String?, transform: CValue<sfTransform>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _transform = transform.getPointer(memScope).rawValue
        val res = kni_sfShader_setTransformParameter(_shader, _name, _transform)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setTransformParameter")
private external fun kni_sfShader_setTransformParameter(shader: NativePtr, name: NativePtr, transform: NativePtr): Unit

fun sfShader_setTextureParameter(shader: CValuesRef<sfShader>?, name: String?, texture: CValuesRef<sfTexture>?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfShader_setTextureParameter(_shader, _name, _texture)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setTextureParameter")
private external fun kni_sfShader_setTextureParameter(shader: NativePtr, name: NativePtr, texture: NativePtr): Unit

fun sfShader_setCurrentTextureParameter(shader: CValuesRef<sfShader>?, name: String?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfShader_setCurrentTextureParameter(_shader, _name)
        res
    }
}

@SymbolName("sfml_kni_sfShader_setCurrentTextureParameter")
private external fun kni_sfShader_setCurrentTextureParameter(shader: NativePtr, name: NativePtr): Unit

fun sfShader_getNativeHandle(shader: CValuesRef<sfShader>?): Int {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val res = kni_sfShader_getNativeHandle(_shader)
        res
    }
}

@SymbolName("sfml_kni_sfShader_getNativeHandle")
private external fun kni_sfShader_getNativeHandle(shader: NativePtr): Int

fun sfShader_bind(shader: CValuesRef<sfShader>?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val res = kni_sfShader_bind(_shader)
        res
    }
}

@SymbolName("sfml_kni_sfShader_bind")
private external fun kni_sfShader_bind(shader: NativePtr): Unit

fun sfShader_isAvailable(): sfBool {
    val res = kni_sfShader_isAvailable()
    return res
}

@SymbolName("sfml_kni_sfShader_isAvailable")
private external fun kni_sfShader_isAvailable(): Int

fun sfShape_create(getPointCount: sfShapeGetPointCountCallback?, getPoint: sfShapeGetPointCallback?, userData: COpaquePointer?): CPointer<sfShape>? {
    val _getPointCount = getPointCount.rawValue
    val _getPoint = getPoint.rawValue
    val _userData = userData.rawValue
    val res = kni_sfShape_create(_getPointCount, _getPoint, _userData)
    return interpretCPointer<sfShape>(res)
}

@SymbolName("sfml_kni_sfShape_create")
private external fun kni_sfShape_create(getPointCount: NativePtr, getPoint: NativePtr, userData: NativePtr): NativePtr

fun sfShape_destroy(shape: CValuesRef<sfShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_destroy(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfShape_destroy")
private external fun kni_sfShape_destroy(shape: NativePtr): Unit

fun sfShape_setPosition(shape: CValuesRef<sfShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfShape_setPosition(_shape, _position)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setPosition")
private external fun kni_sfShape_setPosition(shape: NativePtr, position: NativePtr): Unit

fun sfShape_setRotation(shape: CValuesRef<sfShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfShape_setRotation(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setRotation")
private external fun kni_sfShape_setRotation(shape: NativePtr, angle: Float): Unit

fun sfShape_setScale(shape: CValuesRef<sfShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfShape_setScale(_shape, _scale)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setScale")
private external fun kni_sfShape_setScale(shape: NativePtr, scale: NativePtr): Unit

fun sfShape_setOrigin(shape: CValuesRef<sfShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfShape_setOrigin(_shape, _origin)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setOrigin")
private external fun kni_sfShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

fun sfShape_getPosition(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getPosition")
private external fun kni_sfShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_getRotation(shape: CValuesRef<sfShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getRotation(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfShape_getRotation")
private external fun kni_sfShape_getRotation(shape: NativePtr): Float

fun sfShape_getScale(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getScale")
private external fun kni_sfShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_getOrigin(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getOrigin")
private external fun kni_sfShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_move(shape: CValuesRef<sfShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfShape_move(_shape, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfShape_move")
private external fun kni_sfShape_move(shape: NativePtr, offset: NativePtr): Unit

fun sfShape_rotate(shape: CValuesRef<sfShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfShape_rotate(_shape, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfShape_rotate")
private external fun kni_sfShape_rotate(shape: NativePtr, angle: Float): Unit

fun sfShape_scale(shape: CValuesRef<sfShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfShape_scale(_shape, _factors)
        res
    }
}

@SymbolName("sfml_kni_sfShape_scale")
private external fun kni_sfShape_scale(shape: NativePtr, factors: NativePtr): Unit

fun sfShape_getTransform(shape: CValuesRef<sfShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getTransform")
private external fun kni_sfShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_getInverseTransform(shape: CValuesRef<sfShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getInverseTransform")
private external fun kni_sfShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_setTexture(shape: CValuesRef<sfShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setTexture")
private external fun kni_sfShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

fun sfShape_setTextureRect(shape: CValuesRef<sfShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfShape_setTextureRect(_shape, _rect)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setTextureRect")
private external fun kni_sfShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

fun sfShape_setFillColor(shape: CValuesRef<sfShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfShape_setFillColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setFillColor")
private external fun kni_sfShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

fun sfShape_setOutlineColor(shape: CValuesRef<sfShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfShape_setOutlineColor(_shape, _color)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setOutlineColor")
private external fun kni_sfShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

fun sfShape_setOutlineThickness(shape: CValuesRef<sfShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

@SymbolName("sfml_kni_sfShape_setOutlineThickness")
private external fun kni_sfShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

fun sfShape_getTexture(shape: CValuesRef<sfShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfShape_getTexture")
private external fun kni_sfShape_getTexture(shape: NativePtr): NativePtr

fun sfShape_getTextureRect(shape: CValuesRef<sfShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getTextureRect")
private external fun kni_sfShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_getFillColor(shape: CValuesRef<sfShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getFillColor")
private external fun kni_sfShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_getOutlineColor(shape: CValuesRef<sfShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getOutlineColor")
private external fun kni_sfShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_getOutlineThickness(shape: CValuesRef<sfShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getOutlineThickness(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfShape_getOutlineThickness")
private external fun kni_sfShape_getOutlineThickness(shape: NativePtr): Float

fun sfShape_getPointCount(shape: CValuesRef<sfShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getPointCount(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfShape_getPointCount")
private external fun kni_sfShape_getPointCount(shape: NativePtr): Long

fun sfShape_getPoint(shape: CValuesRef<sfShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getPoint")
private external fun kni_sfShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

fun sfShape_getLocalBounds(shape: CValuesRef<sfShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getLocalBounds")
private external fun kni_sfShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_getGlobalBounds(shape: CValuesRef<sfShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfShape_getGlobalBounds")
private external fun kni_sfShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfShape_update(shape: CValuesRef<sfShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_update(_shape)
        res
    }
}

@SymbolName("sfml_kni_sfShape_update")
private external fun kni_sfShape_update(shape: NativePtr): Unit

fun sfSprite_create(): CPointer<sfSprite>? {
    val res = kni_sfSprite_create()
    return interpretCPointer<sfSprite>(res)
}

@SymbolName("sfml_kni_sfSprite_create")
private external fun kni_sfSprite_create(): NativePtr

fun sfSprite_copy(sprite: CValuesRef<sfSprite>?): CPointer<sfSprite>? {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_copy(_sprite)
        interpretCPointer<sfSprite>(res)
    }
}

@SymbolName("sfml_kni_sfSprite_copy")
private external fun kni_sfSprite_copy(sprite: NativePtr): NativePtr

fun sfSprite_destroy(sprite: CValuesRef<sfSprite>?): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_destroy(_sprite)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_destroy")
private external fun kni_sfSprite_destroy(sprite: NativePtr): Unit

fun sfSprite_setPosition(sprite: CValuesRef<sfSprite>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfSprite_setPosition(_sprite, _position)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_setPosition")
private external fun kni_sfSprite_setPosition(sprite: NativePtr, position: NativePtr): Unit

fun sfSprite_setRotation(sprite: CValuesRef<sfSprite>?, angle: Float): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfSprite_setRotation(_sprite, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_setRotation")
private external fun kni_sfSprite_setRotation(sprite: NativePtr, angle: Float): Unit

fun sfSprite_setScale(sprite: CValuesRef<sfSprite>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfSprite_setScale(_sprite, _scale)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_setScale")
private external fun kni_sfSprite_setScale(sprite: NativePtr, scale: NativePtr): Unit

fun sfSprite_setOrigin(sprite: CValuesRef<sfSprite>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfSprite_setOrigin(_sprite, _origin)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_setOrigin")
private external fun kni_sfSprite_setOrigin(sprite: NativePtr, origin: NativePtr): Unit

fun sfSprite_getPosition(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getPosition(_sprite, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getPosition")
private external fun kni_sfSprite_getPosition(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_getRotation(sprite: CValuesRef<sfSprite>?): Float {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getRotation(_sprite)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_getRotation")
private external fun kni_sfSprite_getRotation(sprite: NativePtr): Float

fun sfSprite_getScale(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getScale(_sprite, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getScale")
private external fun kni_sfSprite_getScale(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_getOrigin(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getOrigin(_sprite, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getOrigin")
private external fun kni_sfSprite_getOrigin(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_move(sprite: CValuesRef<sfSprite>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfSprite_move(_sprite, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_move")
private external fun kni_sfSprite_move(sprite: NativePtr, offset: NativePtr): Unit

fun sfSprite_rotate(sprite: CValuesRef<sfSprite>?, angle: Float): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfSprite_rotate(_sprite, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_rotate")
private external fun kni_sfSprite_rotate(sprite: NativePtr, angle: Float): Unit

fun sfSprite_scale(sprite: CValuesRef<sfSprite>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfSprite_scale(_sprite, _factors)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_scale")
private external fun kni_sfSprite_scale(sprite: NativePtr, factors: NativePtr): Unit

fun sfSprite_getTransform(sprite: CValuesRef<sfSprite>?): CValue<sfTransform> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getTransform(_sprite, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getTransform")
private external fun kni_sfSprite_getTransform(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_getInverseTransform(sprite: CValuesRef<sfSprite>?): CValue<sfTransform> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getInverseTransform(_sprite, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getInverseTransform")
private external fun kni_sfSprite_getInverseTransform(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_setTexture(sprite: CValuesRef<sfSprite>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfSprite_setTexture(_sprite, _texture, _resetRect)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_setTexture")
private external fun kni_sfSprite_setTexture(sprite: NativePtr, texture: NativePtr, resetRect: Int): Unit

fun sfSprite_setTextureRect(sprite: CValuesRef<sfSprite>?, rectangle: CValue<sfIntRect>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfSprite_setTextureRect(_sprite, _rectangle)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_setTextureRect")
private external fun kni_sfSprite_setTextureRect(sprite: NativePtr, rectangle: NativePtr): Unit

fun sfSprite_setColor(sprite: CValuesRef<sfSprite>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfSprite_setColor(_sprite, _color)
        res
    }
}

@SymbolName("sfml_kni_sfSprite_setColor")
private external fun kni_sfSprite_setColor(sprite: NativePtr, color: NativePtr): Unit

fun sfSprite_getTexture(sprite: CValuesRef<sfSprite>?): CPointer<sfTexture>? {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getTexture(_sprite)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfSprite_getTexture")
private external fun kni_sfSprite_getTexture(sprite: NativePtr): NativePtr

fun sfSprite_getTextureRect(sprite: CValuesRef<sfSprite>?): CValue<sfIntRect> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getTextureRect(_sprite, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getTextureRect")
private external fun kni_sfSprite_getTextureRect(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_getColor(sprite: CValuesRef<sfSprite>?): CValue<sfColor> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getColor(_sprite, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getColor")
private external fun kni_sfSprite_getColor(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_getLocalBounds(sprite: CValuesRef<sfSprite>?): CValue<sfFloatRect> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getLocalBounds(_sprite, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getLocalBounds")
private external fun kni_sfSprite_getLocalBounds(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfSprite_getGlobalBounds(sprite: CValuesRef<sfSprite>?): CValue<sfFloatRect> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getGlobalBounds(_sprite, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfSprite_getGlobalBounds")
private external fun kni_sfSprite_getGlobalBounds(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_create(): CPointer<sfText>? {
    val res = kni_sfText_create()
    return interpretCPointer<sfText>(res)
}

@SymbolName("sfml_kni_sfText_create")
private external fun kni_sfText_create(): NativePtr

fun sfText_copy(text: CValuesRef<sfText>?): CPointer<sfText>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_copy(_text)
        interpretCPointer<sfText>(res)
    }
}

@SymbolName("sfml_kni_sfText_copy")
private external fun kni_sfText_copy(text: NativePtr): NativePtr

fun sfText_destroy(text: CValuesRef<sfText>?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_destroy(_text)
        res
    }
}

@SymbolName("sfml_kni_sfText_destroy")
private external fun kni_sfText_destroy(text: NativePtr): Unit

fun sfText_setPosition(text: CValuesRef<sfText>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfText_setPosition(_text, _position)
        res
    }
}

@SymbolName("sfml_kni_sfText_setPosition")
private external fun kni_sfText_setPosition(text: NativePtr, position: NativePtr): Unit

fun sfText_setRotation(text: CValuesRef<sfText>?, angle: Float): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfText_setRotation(_text, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfText_setRotation")
private external fun kni_sfText_setRotation(text: NativePtr, angle: Float): Unit

fun sfText_setScale(text: CValuesRef<sfText>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfText_setScale(_text, _scale)
        res
    }
}

@SymbolName("sfml_kni_sfText_setScale")
private external fun kni_sfText_setScale(text: NativePtr, scale: NativePtr): Unit

fun sfText_setOrigin(text: CValuesRef<sfText>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfText_setOrigin(_text, _origin)
        res
    }
}

@SymbolName("sfml_kni_sfText_setOrigin")
private external fun kni_sfText_setOrigin(text: NativePtr, origin: NativePtr): Unit

fun sfText_getPosition(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getPosition(_text, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getPosition")
private external fun kni_sfText_getPosition(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_getRotation(text: CValuesRef<sfText>?): Float {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getRotation(_text)
        res
    }
}

@SymbolName("sfml_kni_sfText_getRotation")
private external fun kni_sfText_getRotation(text: NativePtr): Float

fun sfText_getScale(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getScale(_text, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getScale")
private external fun kni_sfText_getScale(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_getOrigin(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getOrigin(_text, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getOrigin")
private external fun kni_sfText_getOrigin(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_move(text: CValuesRef<sfText>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfText_move(_text, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfText_move")
private external fun kni_sfText_move(text: NativePtr, offset: NativePtr): Unit

fun sfText_rotate(text: CValuesRef<sfText>?, angle: Float): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfText_rotate(_text, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfText_rotate")
private external fun kni_sfText_rotate(text: NativePtr, angle: Float): Unit

fun sfText_scale(text: CValuesRef<sfText>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfText_scale(_text, _factors)
        res
    }
}

@SymbolName("sfml_kni_sfText_scale")
private external fun kni_sfText_scale(text: NativePtr, factors: NativePtr): Unit

fun sfText_getTransform(text: CValuesRef<sfText>?): CValue<sfTransform> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getTransform(_text, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getTransform")
private external fun kni_sfText_getTransform(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_getInverseTransform(text: CValuesRef<sfText>?): CValue<sfTransform> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getInverseTransform(_text, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getInverseTransform")
private external fun kni_sfText_getInverseTransform(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_setString(text: CValuesRef<sfText>?, string: String?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _string = string?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfText_setString(_text, _string)
        res
    }
}

@SymbolName("sfml_kni_sfText_setString")
private external fun kni_sfText_setString(text: NativePtr, string: NativePtr): Unit

fun sfText_setUnicodeString(text: CValuesRef<sfText>?, string: CValuesRef<sfUint32Var>?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _string = string?.getPointer(memScope).rawValue
        val res = kni_sfText_setUnicodeString(_text, _string)
        res
    }
}

@SymbolName("sfml_kni_sfText_setUnicodeString")
private external fun kni_sfText_setUnicodeString(text: NativePtr, string: NativePtr): Unit

fun sfText_setFont(text: CValuesRef<sfText>?, font: CValuesRef<sfFont>?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfText_setFont(_text, _font)
        res
    }
}

@SymbolName("sfml_kni_sfText_setFont")
private external fun kni_sfText_setFont(text: NativePtr, font: NativePtr): Unit

fun sfText_setCharacterSize(text: CValuesRef<sfText>?, size: Int): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _size = size
        val res = kni_sfText_setCharacterSize(_text, _size)
        res
    }
}

@SymbolName("sfml_kni_sfText_setCharacterSize")
private external fun kni_sfText_setCharacterSize(text: NativePtr, size: Int): Unit

fun sfText_setStyle(text: CValuesRef<sfText>?, style: sfUint32): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _style = style
        val res = kni_sfText_setStyle(_text, _style)
        res
    }
}

@SymbolName("sfml_kni_sfText_setStyle")
private external fun kni_sfText_setStyle(text: NativePtr, style: Int): Unit

fun sfText_setColor(text: CValuesRef<sfText>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfText_setColor(_text, _color)
        res
    }
}

@SymbolName("sfml_kni_sfText_setColor")
private external fun kni_sfText_setColor(text: NativePtr, color: NativePtr): Unit

fun sfText_getString(text: CValuesRef<sfText>?): CPointer<ByteVar>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getString(_text)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfText_getString")
private external fun kni_sfText_getString(text: NativePtr): NativePtr

fun sfText_getUnicodeString(text: CValuesRef<sfText>?): CPointer<sfUint32Var>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getUnicodeString(_text)
        interpretCPointer<sfUint32Var>(res)
    }
}

@SymbolName("sfml_kni_sfText_getUnicodeString")
private external fun kni_sfText_getUnicodeString(text: NativePtr): NativePtr

fun sfText_getFont(text: CValuesRef<sfText>?): CPointer<sfFont>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getFont(_text)
        interpretCPointer<sfFont>(res)
    }
}

@SymbolName("sfml_kni_sfText_getFont")
private external fun kni_sfText_getFont(text: NativePtr): NativePtr

fun sfText_getCharacterSize(text: CValuesRef<sfText>?): Int {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getCharacterSize(_text)
        res
    }
}

@SymbolName("sfml_kni_sfText_getCharacterSize")
private external fun kni_sfText_getCharacterSize(text: NativePtr): Int

fun sfText_getStyle(text: CValuesRef<sfText>?): sfUint32 {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getStyle(_text)
        res
    }
}

@SymbolName("sfml_kni_sfText_getStyle")
private external fun kni_sfText_getStyle(text: NativePtr): Int

fun sfText_getColor(text: CValuesRef<sfText>?): CValue<sfColor> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getColor(_text, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getColor")
private external fun kni_sfText_getColor(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_findCharacterPos(text: CValuesRef<sfText>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfText_findCharacterPos(_text, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_findCharacterPos")
private external fun kni_sfText_findCharacterPos(text: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

fun sfText_getLocalBounds(text: CValuesRef<sfText>?): CValue<sfFloatRect> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getLocalBounds(_text, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getLocalBounds")
private external fun kni_sfText_getLocalBounds(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfText_getGlobalBounds(text: CValuesRef<sfText>?): CValue<sfFloatRect> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getGlobalBounds(_text, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfText_getGlobalBounds")
private external fun kni_sfText_getGlobalBounds(text: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTexture_create(width: Int, height: Int): CPointer<sfTexture>? {
    val _width = width
    val _height = height
    val res = kni_sfTexture_create(_width, _height)
    return interpretCPointer<sfTexture>(res)
}

@SymbolName("sfml_kni_sfTexture_create")
private external fun kni_sfTexture_create(width: Int, height: Int): NativePtr

fun sfTexture_createFromFile(filename: String?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromFile(_filename, _area)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfTexture_createFromFile")
private external fun kni_sfTexture_createFromFile(filename: NativePtr, area: NativePtr): NativePtr

fun sfTexture_createFromMemory(data: COpaquePointer?, sizeInBytes: size_t, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _data = data.rawValue
        val _sizeInBytes = sizeInBytes
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromMemory(_data, _sizeInBytes, _area)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfTexture_createFromMemory")
private external fun kni_sfTexture_createFromMemory(data: NativePtr, sizeInBytes: Long, area: NativePtr): NativePtr

fun sfTexture_createFromStream(stream: CValuesRef<sfInputStream>?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromStream(_stream, _area)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfTexture_createFromStream")
private external fun kni_sfTexture_createFromStream(stream: NativePtr, area: NativePtr): NativePtr

fun sfTexture_createFromImage(image: CValuesRef<sfImage>?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromImage(_image, _area)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfTexture_createFromImage")
private external fun kni_sfTexture_createFromImage(image: NativePtr, area: NativePtr): NativePtr

fun sfTexture_copy(texture: CValuesRef<sfTexture>?): CPointer<sfTexture>? {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_copy(_texture)
        interpretCPointer<sfTexture>(res)
    }
}

@SymbolName("sfml_kni_sfTexture_copy")
private external fun kni_sfTexture_copy(texture: NativePtr): NativePtr

fun sfTexture_destroy(texture: CValuesRef<sfTexture>?): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_destroy(_texture)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_destroy")
private external fun kni_sfTexture_destroy(texture: NativePtr): Unit

fun sfTexture_getSize(texture: CValuesRef<sfTexture>?): CValue<sfVector2u> {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_getSize(_texture, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTexture_getSize")
private external fun kni_sfTexture_getSize(texture: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTexture_copyToImage(texture: CValuesRef<sfTexture>?): CPointer<sfImage>? {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_copyToImage(_texture)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("sfml_kni_sfTexture_copyToImage")
private external fun kni_sfTexture_copyToImage(texture: NativePtr): NativePtr

fun sfTexture_updateFromPixels(texture: CValuesRef<sfTexture>?, pixels: CValuesRef<sfUint8Var>?, width: Int, height: Int, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _pixels = pixels?.getPointer(memScope).rawValue
        val _width = width
        val _height = height
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromPixels(_texture, _pixels, _width, _height, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_updateFromPixels")
private external fun kni_sfTexture_updateFromPixels(texture: NativePtr, pixels: NativePtr, width: Int, height: Int, x: Int, y: Int): Unit

fun sfTexture_updateFromImage(texture: CValuesRef<sfTexture>?, image: CValuesRef<sfImage>?, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _image = image?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromImage(_texture, _image, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_updateFromImage")
private external fun kni_sfTexture_updateFromImage(texture: NativePtr, image: NativePtr, x: Int, y: Int): Unit

fun sfTexture_updateFromWindow(texture: CValuesRef<sfTexture>?, window: CValuesRef<sfWindow>?, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _window = window?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromWindow(_texture, _window, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_updateFromWindow")
private external fun kni_sfTexture_updateFromWindow(texture: NativePtr, window: NativePtr, x: Int, y: Int): Unit

fun sfTexture_updateFromRenderWindow(texture: CValuesRef<sfTexture>?, renderWindow: CValuesRef<sfRenderWindow>?, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromRenderWindow(_texture, _renderWindow, _x, _y)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_updateFromRenderWindow")
private external fun kni_sfTexture_updateFromRenderWindow(texture: NativePtr, renderWindow: NativePtr, x: Int, y: Int): Unit

fun sfTexture_setSmooth(texture: CValuesRef<sfTexture>?, smooth: sfBool): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _smooth = smooth
        val res = kni_sfTexture_setSmooth(_texture, _smooth)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_setSmooth")
private external fun kni_sfTexture_setSmooth(texture: NativePtr, smooth: Int): Unit

fun sfTexture_isSmooth(texture: CValuesRef<sfTexture>?): sfBool {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_isSmooth(_texture)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_isSmooth")
private external fun kni_sfTexture_isSmooth(texture: NativePtr): Int

fun sfTexture_setRepeated(texture: CValuesRef<sfTexture>?, repeated: sfBool): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _repeated = repeated
        val res = kni_sfTexture_setRepeated(_texture, _repeated)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_setRepeated")
private external fun kni_sfTexture_setRepeated(texture: NativePtr, repeated: Int): Unit

fun sfTexture_isRepeated(texture: CValuesRef<sfTexture>?): sfBool {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_isRepeated(_texture)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_isRepeated")
private external fun kni_sfTexture_isRepeated(texture: NativePtr): Int

fun sfTexture_getNativeHandle(texture: CValuesRef<sfTexture>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_getNativeHandle(_texture)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_getNativeHandle")
private external fun kni_sfTexture_getNativeHandle(texture: NativePtr): Int

fun sfTexture_bind(texture: CValuesRef<sfTexture>?): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_bind(_texture)
        res
    }
}

@SymbolName("sfml_kni_sfTexture_bind")
private external fun kni_sfTexture_bind(texture: NativePtr): Unit

fun sfTexture_getMaximumSize(): Int {
    val res = kni_sfTexture_getMaximumSize()
    return res
}

@SymbolName("sfml_kni_sfTexture_getMaximumSize")
private external fun kni_sfTexture_getMaximumSize(): Int

fun sfTransformable_create(): CPointer<sfTransformable>? {
    val res = kni_sfTransformable_create()
    return interpretCPointer<sfTransformable>(res)
}

@SymbolName("sfml_kni_sfTransformable_create")
private external fun kni_sfTransformable_create(): NativePtr

fun sfTransformable_copy(transformable: CValuesRef<sfTransformable>?): CPointer<sfTransformable>? {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_copy(_transformable)
        interpretCPointer<sfTransformable>(res)
    }
}

@SymbolName("sfml_kni_sfTransformable_copy")
private external fun kni_sfTransformable_copy(transformable: NativePtr): NativePtr

fun sfTransformable_destroy(transformable: CValuesRef<sfTransformable>?): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_destroy(_transformable)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_destroy")
private external fun kni_sfTransformable_destroy(transformable: NativePtr): Unit

fun sfTransformable_setPosition(transformable: CValuesRef<sfTransformable>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfTransformable_setPosition(_transformable, _position)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_setPosition")
private external fun kni_sfTransformable_setPosition(transformable: NativePtr, position: NativePtr): Unit

fun sfTransformable_setRotation(transformable: CValuesRef<sfTransformable>?, angle: Float): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfTransformable_setRotation(_transformable, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_setRotation")
private external fun kni_sfTransformable_setRotation(transformable: NativePtr, angle: Float): Unit

fun sfTransformable_setScale(transformable: CValuesRef<sfTransformable>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfTransformable_setScale(_transformable, _scale)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_setScale")
private external fun kni_sfTransformable_setScale(transformable: NativePtr, scale: NativePtr): Unit

fun sfTransformable_setOrigin(transformable: CValuesRef<sfTransformable>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfTransformable_setOrigin(_transformable, _origin)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_setOrigin")
private external fun kni_sfTransformable_setOrigin(transformable: NativePtr, origin: NativePtr): Unit

fun sfTransformable_getPosition(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getPosition(_transformable, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransformable_getPosition")
private external fun kni_sfTransformable_getPosition(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTransformable_getRotation(transformable: CValuesRef<sfTransformable>?): Float {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getRotation(_transformable)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_getRotation")
private external fun kni_sfTransformable_getRotation(transformable: NativePtr): Float

fun sfTransformable_getScale(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getScale(_transformable, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransformable_getScale")
private external fun kni_sfTransformable_getScale(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTransformable_getOrigin(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getOrigin(_transformable, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransformable_getOrigin")
private external fun kni_sfTransformable_getOrigin(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTransformable_move(transformable: CValuesRef<sfTransformable>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfTransformable_move(_transformable, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_move")
private external fun kni_sfTransformable_move(transformable: NativePtr, offset: NativePtr): Unit

fun sfTransformable_rotate(transformable: CValuesRef<sfTransformable>?, angle: Float): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfTransformable_rotate(_transformable, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_rotate")
private external fun kni_sfTransformable_rotate(transformable: NativePtr, angle: Float): Unit

fun sfTransformable_scale(transformable: CValuesRef<sfTransformable>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfTransformable_scale(_transformable, _factors)
        res
    }
}

@SymbolName("sfml_kni_sfTransformable_scale")
private external fun kni_sfTransformable_scale(transformable: NativePtr, factors: NativePtr): Unit

fun sfTransformable_getTransform(transformable: CValuesRef<sfTransformable>?): CValue<sfTransform> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getTransform(_transformable, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransformable_getTransform")
private external fun kni_sfTransformable_getTransform(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTransformable_getInverseTransform(transformable: CValuesRef<sfTransformable>?): CValue<sfTransform> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getInverseTransform(_transformable, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTransformable_getInverseTransform")
private external fun kni_sfTransformable_getInverseTransform(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfVertexArray_create(): CPointer<sfVertexArray>? {
    val res = kni_sfVertexArray_create()
    return interpretCPointer<sfVertexArray>(res)
}

@SymbolName("sfml_kni_sfVertexArray_create")
private external fun kni_sfVertexArray_create(): NativePtr

fun sfVertexArray_copy(vertexArray: CValuesRef<sfVertexArray>?): CPointer<sfVertexArray>? {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_copy(_vertexArray)
        interpretCPointer<sfVertexArray>(res)
    }
}

@SymbolName("sfml_kni_sfVertexArray_copy")
private external fun kni_sfVertexArray_copy(vertexArray: NativePtr): NativePtr

fun sfVertexArray_destroy(vertexArray: CValuesRef<sfVertexArray>?): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_destroy(_vertexArray)
        res
    }
}

@SymbolName("sfml_kni_sfVertexArray_destroy")
private external fun kni_sfVertexArray_destroy(vertexArray: NativePtr): Unit

fun sfVertexArray_getVertexCount(vertexArray: CValuesRef<sfVertexArray>?): size_t {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_getVertexCount(_vertexArray)
        res
    }
}

@SymbolName("sfml_kni_sfVertexArray_getVertexCount")
private external fun kni_sfVertexArray_getVertexCount(vertexArray: NativePtr): Long

fun sfVertexArray_getVertex(vertexArray: CValuesRef<sfVertexArray>?, index: size_t): CPointer<sfVertex>? {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfVertexArray_getVertex(_vertexArray, _index)
        interpretCPointer<sfVertex>(res)
    }
}

@SymbolName("sfml_kni_sfVertexArray_getVertex")
private external fun kni_sfVertexArray_getVertex(vertexArray: NativePtr, index: Long): NativePtr

fun sfVertexArray_clear(vertexArray: CValuesRef<sfVertexArray>?): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_clear(_vertexArray)
        res
    }
}

@SymbolName("sfml_kni_sfVertexArray_clear")
private external fun kni_sfVertexArray_clear(vertexArray: NativePtr): Unit

fun sfVertexArray_resize(vertexArray: CValuesRef<sfVertexArray>?, vertexCount: size_t): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _vertexCount = vertexCount
        val res = kni_sfVertexArray_resize(_vertexArray, _vertexCount)
        res
    }
}

@SymbolName("sfml_kni_sfVertexArray_resize")
private external fun kni_sfVertexArray_resize(vertexArray: NativePtr, vertexCount: Long): Unit

fun sfVertexArray_append(vertexArray: CValuesRef<sfVertexArray>?, vertex: CValue<sfVertex>): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _vertex = vertex.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_append(_vertexArray, _vertex)
        res
    }
}

@SymbolName("sfml_kni_sfVertexArray_append")
private external fun kni_sfVertexArray_append(vertexArray: NativePtr, vertex: NativePtr): Unit

fun sfVertexArray_setPrimitiveType(vertexArray: CValuesRef<sfVertexArray>?, type: sfPrimitiveType): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _type = type.value
        val res = kni_sfVertexArray_setPrimitiveType(_vertexArray, _type)
        res
    }
}

@SymbolName("sfml_kni_sfVertexArray_setPrimitiveType")
private external fun kni_sfVertexArray_setPrimitiveType(vertexArray: NativePtr, type: Int): Unit

fun sfVertexArray_getPrimitiveType(vertexArray: CValuesRef<sfVertexArray>?): sfPrimitiveType {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_getPrimitiveType(_vertexArray)
        sfPrimitiveType.byValue(res)
    }
}

@SymbolName("sfml_kni_sfVertexArray_getPrimitiveType")
private external fun kni_sfVertexArray_getPrimitiveType(vertexArray: NativePtr): Int

fun sfVertexArray_getBounds(vertexArray: CValuesRef<sfVertexArray>?): CValue<sfFloatRect> {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_getBounds(_vertexArray, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfVertexArray_getBounds")
private external fun kni_sfVertexArray_getBounds(vertexArray: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfView_create(): CPointer<sfView>? {
    val res = kni_sfView_create()
    return interpretCPointer<sfView>(res)
}

@SymbolName("sfml_kni_sfView_create")
private external fun kni_sfView_create(): NativePtr

fun sfView_createFromRect(rectangle: CValue<sfFloatRect>): CPointer<sfView>? {
    return memScoped {
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfView_createFromRect(_rectangle)
        interpretCPointer<sfView>(res)
    }
}

@SymbolName("sfml_kni_sfView_createFromRect")
private external fun kni_sfView_createFromRect(rectangle: NativePtr): NativePtr

fun sfView_copy(view: CValuesRef<sfView>?): CPointer<sfView>? {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_copy(_view)
        interpretCPointer<sfView>(res)
    }
}

@SymbolName("sfml_kni_sfView_copy")
private external fun kni_sfView_copy(view: NativePtr): NativePtr

fun sfView_destroy(view: CValuesRef<sfView>?): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_destroy(_view)
        res
    }
}

@SymbolName("sfml_kni_sfView_destroy")
private external fun kni_sfView_destroy(view: NativePtr): Unit

fun sfView_setCenter(view: CValuesRef<sfView>?, center: CValue<sfVector2f>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _center = center.getPointer(memScope).rawValue
        val res = kni_sfView_setCenter(_view, _center)
        res
    }
}

@SymbolName("sfml_kni_sfView_setCenter")
private external fun kni_sfView_setCenter(view: NativePtr, center: NativePtr): Unit

fun sfView_setSize(view: CValuesRef<sfView>?, size: CValue<sfVector2f>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfView_setSize(_view, _size)
        res
    }
}

@SymbolName("sfml_kni_sfView_setSize")
private external fun kni_sfView_setSize(view: NativePtr, size: NativePtr): Unit

fun sfView_setRotation(view: CValuesRef<sfView>?, angle: Float): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfView_setRotation(_view, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfView_setRotation")
private external fun kni_sfView_setRotation(view: NativePtr, angle: Float): Unit

fun sfView_setViewport(view: CValuesRef<sfView>?, viewport: CValue<sfFloatRect>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _viewport = viewport.getPointer(memScope).rawValue
        val res = kni_sfView_setViewport(_view, _viewport)
        res
    }
}

@SymbolName("sfml_kni_sfView_setViewport")
private external fun kni_sfView_setViewport(view: NativePtr, viewport: NativePtr): Unit

fun sfView_reset(view: CValuesRef<sfView>?, rectangle: CValue<sfFloatRect>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfView_reset(_view, _rectangle)
        res
    }
}

@SymbolName("sfml_kni_sfView_reset")
private external fun kni_sfView_reset(view: NativePtr, rectangle: NativePtr): Unit

fun sfView_getCenter(view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getCenter(_view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfView_getCenter")
private external fun kni_sfView_getCenter(view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfView_getSize(view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getSize(_view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfView_getSize")
private external fun kni_sfView_getSize(view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfView_getRotation(view: CValuesRef<sfView>?): Float {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getRotation(_view)
        res
    }
}

@SymbolName("sfml_kni_sfView_getRotation")
private external fun kni_sfView_getRotation(view: NativePtr): Float

fun sfView_getViewport(view: CValuesRef<sfView>?): CValue<sfFloatRect> {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getViewport(_view, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfView_getViewport")
private external fun kni_sfView_getViewport(view: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfView_move(view: CValuesRef<sfView>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfView_move(_view, _offset)
        res
    }
}

@SymbolName("sfml_kni_sfView_move")
private external fun kni_sfView_move(view: NativePtr, offset: NativePtr): Unit

fun sfView_rotate(view: CValuesRef<sfView>?, angle: Float): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfView_rotate(_view, _angle)
        res
    }
}

@SymbolName("sfml_kni_sfView_rotate")
private external fun kni_sfView_rotate(view: NativePtr, angle: Float): Unit

fun sfView_zoom(view: CValuesRef<sfView>?, factor: Float): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _factor = factor
        val res = kni_sfView_zoom(_view, _factor)
        res
    }
}

@SymbolName("sfml_kni_sfView_zoom")
private external fun kni_sfView_zoom(view: NativePtr, factor: Float): Unit

fun sfIpAddress_fromString(address: String?): CValue<sfIpAddress> {
    return memScoped {
        val _address = address?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfIpAddress_fromString(_address, alloc<sfIpAddress>().rawPtr)
        interpretPointed<sfIpAddress>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfIpAddress_fromString")
private external fun kni_sfIpAddress_fromString(address: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfIpAddress_fromBytes(byte0: sfUint8, byte1: sfUint8, byte2: sfUint8, byte3: sfUint8): CValue<sfIpAddress> {
    return memScoped {
        val _byte0 = byte0
        val _byte1 = byte1
        val _byte2 = byte2
        val _byte3 = byte3
        val res = kni_sfIpAddress_fromBytes(_byte0, _byte1, _byte2, _byte3, alloc<sfIpAddress>().rawPtr)
        interpretPointed<sfIpAddress>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfIpAddress_fromBytes")
private external fun kni_sfIpAddress_fromBytes(byte0: Byte, byte1: Byte, byte2: Byte, byte3: Byte, retValPlacement: NativePtr): NativePtr

fun sfIpAddress_fromInteger(address: sfUint32): CValue<sfIpAddress> {
    return memScoped {
        val _address = address
        val res = kni_sfIpAddress_fromInteger(_address, alloc<sfIpAddress>().rawPtr)
        interpretPointed<sfIpAddress>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfIpAddress_fromInteger")
private external fun kni_sfIpAddress_fromInteger(address: Int, retValPlacement: NativePtr): NativePtr

fun sfIpAddress_toString(address: CValue<sfIpAddress>, string: CValuesRef<ByteVar>?): Unit {
    return memScoped {
        val _address = address.getPointer(memScope).rawValue
        val _string = string?.getPointer(memScope).rawValue
        val res = kni_sfIpAddress_toString(_address, _string)
        res
    }
}

@SymbolName("sfml_kni_sfIpAddress_toString")
private external fun kni_sfIpAddress_toString(address: NativePtr, string: NativePtr): Unit

fun sfIpAddress_toInteger(address: CValue<sfIpAddress>): sfUint32 {
    return memScoped {
        val _address = address.getPointer(memScope).rawValue
        val res = kni_sfIpAddress_toInteger(_address)
        res
    }
}

@SymbolName("sfml_kni_sfIpAddress_toInteger")
private external fun kni_sfIpAddress_toInteger(address: NativePtr): Int

fun sfIpAddress_getLocalAddress(): CValue<sfIpAddress> {
    return memScoped {
        val res = kni_sfIpAddress_getLocalAddress(alloc<sfIpAddress>().rawPtr)
        interpretPointed<sfIpAddress>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfIpAddress_getLocalAddress")
private external fun kni_sfIpAddress_getLocalAddress(retValPlacement: NativePtr): NativePtr

fun sfIpAddress_getPublicAddress(timeout: CValue<sfTime>): CValue<sfIpAddress> {
    return memScoped {
        val _timeout = timeout.getPointer(memScope).rawValue
        val res = kni_sfIpAddress_getPublicAddress(_timeout, alloc<sfIpAddress>().rawPtr)
        interpretPointed<sfIpAddress>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfIpAddress_getPublicAddress")
private external fun kni_sfIpAddress_getPublicAddress(timeout: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfFtpListingResponse_destroy(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): Unit {
    return memScoped {
        val _ftpListingResponse = ftpListingResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpListingResponse_destroy(_ftpListingResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpListingResponse_destroy")
private external fun kni_sfFtpListingResponse_destroy(ftpListingResponse: NativePtr): Unit

fun sfFtpListingResponse_isOk(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): sfBool {
    return memScoped {
        val _ftpListingResponse = ftpListingResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpListingResponse_isOk(_ftpListingResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpListingResponse_isOk")
private external fun kni_sfFtpListingResponse_isOk(ftpListingResponse: NativePtr): Int

fun sfFtpListingResponse_getStatus(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): sfFtpStatus {
    return memScoped {
        val _ftpListingResponse = ftpListingResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpListingResponse_getStatus(_ftpListingResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpListingResponse_getStatus")
private external fun kni_sfFtpListingResponse_getStatus(ftpListingResponse: NativePtr): Int

fun sfFtpListingResponse_getMessage(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): CPointer<ByteVar>? {
    return memScoped {
        val _ftpListingResponse = ftpListingResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpListingResponse_getMessage(_ftpListingResponse)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfFtpListingResponse_getMessage")
private external fun kni_sfFtpListingResponse_getMessage(ftpListingResponse: NativePtr): NativePtr

fun sfFtpListingResponse_getCount(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): size_t {
    return memScoped {
        val _ftpListingResponse = ftpListingResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpListingResponse_getCount(_ftpListingResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpListingResponse_getCount")
private external fun kni_sfFtpListingResponse_getCount(ftpListingResponse: NativePtr): Long

fun sfFtpListingResponse_getName(ftpListingResponse: CValuesRef<sfFtpListingResponse>?, index: size_t): CPointer<ByteVar>? {
    return memScoped {
        val _ftpListingResponse = ftpListingResponse?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfFtpListingResponse_getName(_ftpListingResponse, _index)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfFtpListingResponse_getName")
private external fun kni_sfFtpListingResponse_getName(ftpListingResponse: NativePtr, index: Long): NativePtr

fun sfFtpDirectoryResponse_destroy(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): Unit {
    return memScoped {
        val _ftpDirectoryResponse = ftpDirectoryResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpDirectoryResponse_destroy(_ftpDirectoryResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpDirectoryResponse_destroy")
private external fun kni_sfFtpDirectoryResponse_destroy(ftpDirectoryResponse: NativePtr): Unit

fun sfFtpDirectoryResponse_isOk(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): sfBool {
    return memScoped {
        val _ftpDirectoryResponse = ftpDirectoryResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpDirectoryResponse_isOk(_ftpDirectoryResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpDirectoryResponse_isOk")
private external fun kni_sfFtpDirectoryResponse_isOk(ftpDirectoryResponse: NativePtr): Int

fun sfFtpDirectoryResponse_getStatus(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): sfFtpStatus {
    return memScoped {
        val _ftpDirectoryResponse = ftpDirectoryResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpDirectoryResponse_getStatus(_ftpDirectoryResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpDirectoryResponse_getStatus")
private external fun kni_sfFtpDirectoryResponse_getStatus(ftpDirectoryResponse: NativePtr): Int

fun sfFtpDirectoryResponse_getMessage(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): CPointer<ByteVar>? {
    return memScoped {
        val _ftpDirectoryResponse = ftpDirectoryResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpDirectoryResponse_getMessage(_ftpDirectoryResponse)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfFtpDirectoryResponse_getMessage")
private external fun kni_sfFtpDirectoryResponse_getMessage(ftpDirectoryResponse: NativePtr): NativePtr

fun sfFtpDirectoryResponse_getDirectory(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): CPointer<ByteVar>? {
    return memScoped {
        val _ftpDirectoryResponse = ftpDirectoryResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpDirectoryResponse_getDirectory(_ftpDirectoryResponse)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfFtpDirectoryResponse_getDirectory")
private external fun kni_sfFtpDirectoryResponse_getDirectory(ftpDirectoryResponse: NativePtr): NativePtr

fun sfFtpResponse_destroy(ftpResponse: CValuesRef<sfFtpResponse>?): Unit {
    return memScoped {
        val _ftpResponse = ftpResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpResponse_destroy(_ftpResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpResponse_destroy")
private external fun kni_sfFtpResponse_destroy(ftpResponse: NativePtr): Unit

fun sfFtpResponse_isOk(ftpResponse: CValuesRef<sfFtpResponse>?): sfBool {
    return memScoped {
        val _ftpResponse = ftpResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpResponse_isOk(_ftpResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpResponse_isOk")
private external fun kni_sfFtpResponse_isOk(ftpResponse: NativePtr): Int

fun sfFtpResponse_getStatus(ftpResponse: CValuesRef<sfFtpResponse>?): sfFtpStatus {
    return memScoped {
        val _ftpResponse = ftpResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpResponse_getStatus(_ftpResponse)
        res
    }
}

@SymbolName("sfml_kni_sfFtpResponse_getStatus")
private external fun kni_sfFtpResponse_getStatus(ftpResponse: NativePtr): Int

fun sfFtpResponse_getMessage(ftpResponse: CValuesRef<sfFtpResponse>?): CPointer<ByteVar>? {
    return memScoped {
        val _ftpResponse = ftpResponse?.getPointer(memScope).rawValue
        val res = kni_sfFtpResponse_getMessage(_ftpResponse)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfFtpResponse_getMessage")
private external fun kni_sfFtpResponse_getMessage(ftpResponse: NativePtr): NativePtr

fun sfFtp_create(): CPointer<sfFtp>? {
    val res = kni_sfFtp_create()
    return interpretCPointer<sfFtp>(res)
}

@SymbolName("sfml_kni_sfFtp_create")
private external fun kni_sfFtp_create(): NativePtr

fun sfFtp_destroy(ftp: CValuesRef<sfFtp>?): Unit {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val res = kni_sfFtp_destroy(_ftp)
        res
    }
}

@SymbolName("sfml_kni_sfFtp_destroy")
private external fun kni_sfFtp_destroy(ftp: NativePtr): Unit

fun sfFtp_connect(ftp: CValuesRef<sfFtp>?, server: CValue<sfIpAddress>, port: Short, timeout: CValue<sfTime>): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _server = server.getPointer(memScope).rawValue
        val _port = port
        val _timeout = timeout.getPointer(memScope).rawValue
        val res = kni_sfFtp_connect(_ftp, _server, _port, _timeout)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_connect")
private external fun kni_sfFtp_connect(ftp: NativePtr, server: NativePtr, port: Short, timeout: NativePtr): NativePtr

fun sfFtp_loginAnonymous(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val res = kni_sfFtp_loginAnonymous(_ftp)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_loginAnonymous")
private external fun kni_sfFtp_loginAnonymous(ftp: NativePtr): NativePtr

fun sfFtp_login(ftp: CValuesRef<sfFtp>?, userName: String?, password: String?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _userName = userName?.cstr?.getPointer(memScope).rawValue
        val _password = password?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFtp_login(_ftp, _userName, _password)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_login")
private external fun kni_sfFtp_login(ftp: NativePtr, userName: NativePtr, password: NativePtr): NativePtr

fun sfFtp_disconnect(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val res = kni_sfFtp_disconnect(_ftp)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_disconnect")
private external fun kni_sfFtp_disconnect(ftp: NativePtr): NativePtr

fun sfFtp_keepAlive(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val res = kni_sfFtp_keepAlive(_ftp)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_keepAlive")
private external fun kni_sfFtp_keepAlive(ftp: NativePtr): NativePtr

fun sfFtp_getWorkingDirectory(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpDirectoryResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val res = kni_sfFtp_getWorkingDirectory(_ftp)
        interpretCPointer<sfFtpDirectoryResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_getWorkingDirectory")
private external fun kni_sfFtp_getWorkingDirectory(ftp: NativePtr): NativePtr

fun sfFtp_getDirectoryListing(ftp: CValuesRef<sfFtp>?, directory: String?): CPointer<sfFtpListingResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _directory = directory?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFtp_getDirectoryListing(_ftp, _directory)
        interpretCPointer<sfFtpListingResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_getDirectoryListing")
private external fun kni_sfFtp_getDirectoryListing(ftp: NativePtr, directory: NativePtr): NativePtr

fun sfFtp_changeDirectory(ftp: CValuesRef<sfFtp>?, directory: String?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _directory = directory?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFtp_changeDirectory(_ftp, _directory)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_changeDirectory")
private external fun kni_sfFtp_changeDirectory(ftp: NativePtr, directory: NativePtr): NativePtr

fun sfFtp_parentDirectory(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val res = kni_sfFtp_parentDirectory(_ftp)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_parentDirectory")
private external fun kni_sfFtp_parentDirectory(ftp: NativePtr): NativePtr

fun sfFtp_createDirectory(ftp: CValuesRef<sfFtp>?, name: String?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFtp_createDirectory(_ftp, _name)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_createDirectory")
private external fun kni_sfFtp_createDirectory(ftp: NativePtr, name: NativePtr): NativePtr

fun sfFtp_deleteDirectory(ftp: CValuesRef<sfFtp>?, name: String?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFtp_deleteDirectory(_ftp, _name)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_deleteDirectory")
private external fun kni_sfFtp_deleteDirectory(ftp: NativePtr, name: NativePtr): NativePtr

fun sfFtp_renameFile(ftp: CValuesRef<sfFtp>?, file: String?, newName: String?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _file = file?.cstr?.getPointer(memScope).rawValue
        val _newName = newName?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFtp_renameFile(_ftp, _file, _newName)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_renameFile")
private external fun kni_sfFtp_renameFile(ftp: NativePtr, file: NativePtr, newName: NativePtr): NativePtr

fun sfFtp_deleteFile(ftp: CValuesRef<sfFtp>?, name: String?): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFtp_deleteFile(_ftp, _name)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_deleteFile")
private external fun kni_sfFtp_deleteFile(ftp: NativePtr, name: NativePtr): NativePtr

fun sfFtp_download(ftp: CValuesRef<sfFtp>?, distantFile: String?, destPath: String?, mode: sfFtpTransferMode): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _distantFile = distantFile?.cstr?.getPointer(memScope).rawValue
        val _destPath = destPath?.cstr?.getPointer(memScope).rawValue
        val _mode = mode.value
        val res = kni_sfFtp_download(_ftp, _distantFile, _destPath, _mode)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_download")
private external fun kni_sfFtp_download(ftp: NativePtr, distantFile: NativePtr, destPath: NativePtr, mode: Int): NativePtr

fun sfFtp_upload(ftp: CValuesRef<sfFtp>?, localFile: String?, destPath: String?, mode: sfFtpTransferMode): CPointer<sfFtpResponse>? {
    return memScoped {
        val _ftp = ftp?.getPointer(memScope).rawValue
        val _localFile = localFile?.cstr?.getPointer(memScope).rawValue
        val _destPath = destPath?.cstr?.getPointer(memScope).rawValue
        val _mode = mode.value
        val res = kni_sfFtp_upload(_ftp, _localFile, _destPath, _mode)
        interpretCPointer<sfFtpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfFtp_upload")
private external fun kni_sfFtp_upload(ftp: NativePtr, localFile: NativePtr, destPath: NativePtr, mode: Int): NativePtr

fun sfHttpRequest_create(): CPointer<sfHttpRequest>? {
    val res = kni_sfHttpRequest_create()
    return interpretCPointer<sfHttpRequest>(res)
}

@SymbolName("sfml_kni_sfHttpRequest_create")
private external fun kni_sfHttpRequest_create(): NativePtr

fun sfHttpRequest_destroy(httpRequest: CValuesRef<sfHttpRequest>?): Unit {
    return memScoped {
        val _httpRequest = httpRequest?.getPointer(memScope).rawValue
        val res = kni_sfHttpRequest_destroy(_httpRequest)
        res
    }
}

@SymbolName("sfml_kni_sfHttpRequest_destroy")
private external fun kni_sfHttpRequest_destroy(httpRequest: NativePtr): Unit

fun sfHttpRequest_setField(httpRequest: CValuesRef<sfHttpRequest>?, field: String?, value: String?): Unit {
    return memScoped {
        val _httpRequest = httpRequest?.getPointer(memScope).rawValue
        val _field = field?.cstr?.getPointer(memScope).rawValue
        val _value = value?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfHttpRequest_setField(_httpRequest, _field, _value)
        res
    }
}

@SymbolName("sfml_kni_sfHttpRequest_setField")
private external fun kni_sfHttpRequest_setField(httpRequest: NativePtr, field: NativePtr, value: NativePtr): Unit

fun sfHttpRequest_setMethod(httpRequest: CValuesRef<sfHttpRequest>?, method: sfHttpMethod): Unit {
    return memScoped {
        val _httpRequest = httpRequest?.getPointer(memScope).rawValue
        val _method = method.value
        val res = kni_sfHttpRequest_setMethod(_httpRequest, _method)
        res
    }
}

@SymbolName("sfml_kni_sfHttpRequest_setMethod")
private external fun kni_sfHttpRequest_setMethod(httpRequest: NativePtr, method: Int): Unit

fun sfHttpRequest_setUri(httpRequest: CValuesRef<sfHttpRequest>?, uri: String?): Unit {
    return memScoped {
        val _httpRequest = httpRequest?.getPointer(memScope).rawValue
        val _uri = uri?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfHttpRequest_setUri(_httpRequest, _uri)
        res
    }
}

@SymbolName("sfml_kni_sfHttpRequest_setUri")
private external fun kni_sfHttpRequest_setUri(httpRequest: NativePtr, uri: NativePtr): Unit

fun sfHttpRequest_setHttpVersion(httpRequest: CValuesRef<sfHttpRequest>?, major: Int, minor: Int): Unit {
    return memScoped {
        val _httpRequest = httpRequest?.getPointer(memScope).rawValue
        val _major = major
        val _minor = minor
        val res = kni_sfHttpRequest_setHttpVersion(_httpRequest, _major, _minor)
        res
    }
}

@SymbolName("sfml_kni_sfHttpRequest_setHttpVersion")
private external fun kni_sfHttpRequest_setHttpVersion(httpRequest: NativePtr, major: Int, minor: Int): Unit

fun sfHttpRequest_setBody(httpRequest: CValuesRef<sfHttpRequest>?, body: String?): Unit {
    return memScoped {
        val _httpRequest = httpRequest?.getPointer(memScope).rawValue
        val _body = body?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfHttpRequest_setBody(_httpRequest, _body)
        res
    }
}

@SymbolName("sfml_kni_sfHttpRequest_setBody")
private external fun kni_sfHttpRequest_setBody(httpRequest: NativePtr, body: NativePtr): Unit

fun sfHttpResponse_destroy(httpResponse: CValuesRef<sfHttpResponse>?): Unit {
    return memScoped {
        val _httpResponse = httpResponse?.getPointer(memScope).rawValue
        val res = kni_sfHttpResponse_destroy(_httpResponse)
        res
    }
}

@SymbolName("sfml_kni_sfHttpResponse_destroy")
private external fun kni_sfHttpResponse_destroy(httpResponse: NativePtr): Unit

fun sfHttpResponse_getField(httpResponse: CValuesRef<sfHttpResponse>?, field: String?): CPointer<ByteVar>? {
    return memScoped {
        val _httpResponse = httpResponse?.getPointer(memScope).rawValue
        val _field = field?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfHttpResponse_getField(_httpResponse, _field)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfHttpResponse_getField")
private external fun kni_sfHttpResponse_getField(httpResponse: NativePtr, field: NativePtr): NativePtr

fun sfHttpResponse_getStatus(httpResponse: CValuesRef<sfHttpResponse>?): sfHttpStatus {
    return memScoped {
        val _httpResponse = httpResponse?.getPointer(memScope).rawValue
        val res = kni_sfHttpResponse_getStatus(_httpResponse)
        res
    }
}

@SymbolName("sfml_kni_sfHttpResponse_getStatus")
private external fun kni_sfHttpResponse_getStatus(httpResponse: NativePtr): Int

fun sfHttpResponse_getMajorVersion(httpResponse: CValuesRef<sfHttpResponse>?): Int {
    return memScoped {
        val _httpResponse = httpResponse?.getPointer(memScope).rawValue
        val res = kni_sfHttpResponse_getMajorVersion(_httpResponse)
        res
    }
}

@SymbolName("sfml_kni_sfHttpResponse_getMajorVersion")
private external fun kni_sfHttpResponse_getMajorVersion(httpResponse: NativePtr): Int

fun sfHttpResponse_getMinorVersion(httpResponse: CValuesRef<sfHttpResponse>?): Int {
    return memScoped {
        val _httpResponse = httpResponse?.getPointer(memScope).rawValue
        val res = kni_sfHttpResponse_getMinorVersion(_httpResponse)
        res
    }
}

@SymbolName("sfml_kni_sfHttpResponse_getMinorVersion")
private external fun kni_sfHttpResponse_getMinorVersion(httpResponse: NativePtr): Int

fun sfHttpResponse_getBody(httpResponse: CValuesRef<sfHttpResponse>?): CPointer<ByteVar>? {
    return memScoped {
        val _httpResponse = httpResponse?.getPointer(memScope).rawValue
        val res = kni_sfHttpResponse_getBody(_httpResponse)
        interpretCPointer<ByteVar>(res)
    }
}

@SymbolName("sfml_kni_sfHttpResponse_getBody")
private external fun kni_sfHttpResponse_getBody(httpResponse: NativePtr): NativePtr

fun sfHttp_create(): CPointer<sfHttp>? {
    val res = kni_sfHttp_create()
    return interpretCPointer<sfHttp>(res)
}

@SymbolName("sfml_kni_sfHttp_create")
private external fun kni_sfHttp_create(): NativePtr

fun sfHttp_destroy(http: CValuesRef<sfHttp>?): Unit {
    return memScoped {
        val _http = http?.getPointer(memScope).rawValue
        val res = kni_sfHttp_destroy(_http)
        res
    }
}

@SymbolName("sfml_kni_sfHttp_destroy")
private external fun kni_sfHttp_destroy(http: NativePtr): Unit

fun sfHttp_setHost(http: CValuesRef<sfHttp>?, host: String?, port: Short): Unit {
    return memScoped {
        val _http = http?.getPointer(memScope).rawValue
        val _host = host?.cstr?.getPointer(memScope).rawValue
        val _port = port
        val res = kni_sfHttp_setHost(_http, _host, _port)
        res
    }
}

@SymbolName("sfml_kni_sfHttp_setHost")
private external fun kni_sfHttp_setHost(http: NativePtr, host: NativePtr, port: Short): Unit

fun sfHttp_sendRequest(http: CValuesRef<sfHttp>?, request: CValuesRef<sfHttpRequest>?, timeout: CValue<sfTime>): CPointer<sfHttpResponse>? {
    return memScoped {
        val _http = http?.getPointer(memScope).rawValue
        val _request = request?.getPointer(memScope).rawValue
        val _timeout = timeout.getPointer(memScope).rawValue
        val res = kni_sfHttp_sendRequest(_http, _request, _timeout)
        interpretCPointer<sfHttpResponse>(res)
    }
}

@SymbolName("sfml_kni_sfHttp_sendRequest")
private external fun kni_sfHttp_sendRequest(http: NativePtr, request: NativePtr, timeout: NativePtr): NativePtr

fun sfPacket_create(): CPointer<sfPacket>? {
    val res = kni_sfPacket_create()
    return interpretCPointer<sfPacket>(res)
}

@SymbolName("sfml_kni_sfPacket_create")
private external fun kni_sfPacket_create(): NativePtr

fun sfPacket_copy(packet: CValuesRef<sfPacket>?): CPointer<sfPacket>? {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_copy(_packet)
        interpretCPointer<sfPacket>(res)
    }
}

@SymbolName("sfml_kni_sfPacket_copy")
private external fun kni_sfPacket_copy(packet: NativePtr): NativePtr

fun sfPacket_destroy(packet: CValuesRef<sfPacket>?): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_destroy(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_destroy")
private external fun kni_sfPacket_destroy(packet: NativePtr): Unit

fun sfPacket_append(packet: CValuesRef<sfPacket>?, data: COpaquePointer?, sizeInBytes: size_t): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val _sizeInBytes = sizeInBytes
        val res = kni_sfPacket_append(_packet, _data, _sizeInBytes)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_append")
private external fun kni_sfPacket_append(packet: NativePtr, data: NativePtr, sizeInBytes: Long): Unit

fun sfPacket_clear(packet: CValuesRef<sfPacket>?): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_clear(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_clear")
private external fun kni_sfPacket_clear(packet: NativePtr): Unit

fun sfPacket_getData(packet: CValuesRef<sfPacket>?): COpaquePointer? {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_getData(_packet)
        interpretCPointer<COpaque>(res)
    }
}

@SymbolName("sfml_kni_sfPacket_getData")
private external fun kni_sfPacket_getData(packet: NativePtr): NativePtr

fun sfPacket_getDataSize(packet: CValuesRef<sfPacket>?): size_t {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_getDataSize(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_getDataSize")
private external fun kni_sfPacket_getDataSize(packet: NativePtr): Long

fun sfPacket_endOfPacket(packet: CValuesRef<sfPacket>?): sfBool {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_endOfPacket(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_endOfPacket")
private external fun kni_sfPacket_endOfPacket(packet: NativePtr): Int

fun sfPacket_canRead(packet: CValuesRef<sfPacket>?): sfBool {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_canRead(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_canRead")
private external fun kni_sfPacket_canRead(packet: NativePtr): Int

fun sfPacket_readBool(packet: CValuesRef<sfPacket>?): sfBool {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readBool(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readBool")
private external fun kni_sfPacket_readBool(packet: NativePtr): Int

fun sfPacket_readInt8(packet: CValuesRef<sfPacket>?): sfInt8 {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readInt8(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readInt8")
private external fun kni_sfPacket_readInt8(packet: NativePtr): Byte

fun sfPacket_readUint8(packet: CValuesRef<sfPacket>?): sfUint8 {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readUint8(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readUint8")
private external fun kni_sfPacket_readUint8(packet: NativePtr): Byte

fun sfPacket_readInt16(packet: CValuesRef<sfPacket>?): sfInt16 {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readInt16(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readInt16")
private external fun kni_sfPacket_readInt16(packet: NativePtr): Short

fun sfPacket_readUint16(packet: CValuesRef<sfPacket>?): sfUint16 {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readUint16(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readUint16")
private external fun kni_sfPacket_readUint16(packet: NativePtr): Short

fun sfPacket_readInt32(packet: CValuesRef<sfPacket>?): sfInt32 {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readInt32(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readInt32")
private external fun kni_sfPacket_readInt32(packet: NativePtr): Int

fun sfPacket_readUint32(packet: CValuesRef<sfPacket>?): sfUint32 {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readUint32(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readUint32")
private external fun kni_sfPacket_readUint32(packet: NativePtr): Int

fun sfPacket_readFloat(packet: CValuesRef<sfPacket>?): Float {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readFloat(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readFloat")
private external fun kni_sfPacket_readFloat(packet: NativePtr): Float

fun sfPacket_readDouble(packet: CValuesRef<sfPacket>?): Double {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readDouble(_packet)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readDouble")
private external fun kni_sfPacket_readDouble(packet: NativePtr): Double

fun sfPacket_readString(packet: CValuesRef<sfPacket>?, string: CValuesRef<ByteVar>?): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _string = string?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readString(_packet, _string)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readString")
private external fun kni_sfPacket_readString(packet: NativePtr, string: NativePtr): Unit

fun sfPacket_readWideString(packet: CValuesRef<sfPacket>?, string: CValuesRef<wchar_tVar>?): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _string = string?.getPointer(memScope).rawValue
        val res = kni_sfPacket_readWideString(_packet, _string)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_readWideString")
private external fun kni_sfPacket_readWideString(packet: NativePtr, string: NativePtr): Unit

fun sfPacket_writeBool(packet: CValuesRef<sfPacket>?, arg1: sfBool): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeBool(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeBool")
private external fun kni_sfPacket_writeBool(packet: NativePtr, arg1: Int): Unit

fun sfPacket_writeInt8(packet: CValuesRef<sfPacket>?, arg1: sfInt8): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeInt8(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeInt8")
private external fun kni_sfPacket_writeInt8(packet: NativePtr, arg1: Byte): Unit

fun sfPacket_writeUint8(packet: CValuesRef<sfPacket>?, arg1: sfUint8): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeUint8(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeUint8")
private external fun kni_sfPacket_writeUint8(packet: NativePtr, arg1: Byte): Unit

fun sfPacket_writeInt16(packet: CValuesRef<sfPacket>?, arg1: sfInt16): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeInt16(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeInt16")
private external fun kni_sfPacket_writeInt16(packet: NativePtr, arg1: Short): Unit

fun sfPacket_writeUint16(packet: CValuesRef<sfPacket>?, arg1: sfUint16): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeUint16(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeUint16")
private external fun kni_sfPacket_writeUint16(packet: NativePtr, arg1: Short): Unit

fun sfPacket_writeInt32(packet: CValuesRef<sfPacket>?, arg1: sfInt32): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeInt32(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeInt32")
private external fun kni_sfPacket_writeInt32(packet: NativePtr, arg1: Int): Unit

fun sfPacket_writeUint32(packet: CValuesRef<sfPacket>?, arg1: sfUint32): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeUint32(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeUint32")
private external fun kni_sfPacket_writeUint32(packet: NativePtr, arg1: Int): Unit

fun sfPacket_writeFloat(packet: CValuesRef<sfPacket>?, arg1: Float): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeFloat(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeFloat")
private external fun kni_sfPacket_writeFloat(packet: NativePtr, arg1: Float): Unit

fun sfPacket_writeDouble(packet: CValuesRef<sfPacket>?, arg1: Double): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _arg1 = arg1
        val res = kni_sfPacket_writeDouble(_packet, _arg1)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeDouble")
private external fun kni_sfPacket_writeDouble(packet: NativePtr, arg1: Double): Unit

fun sfPacket_writeString(packet: CValuesRef<sfPacket>?, string: String?): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _string = string?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfPacket_writeString(_packet, _string)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeString")
private external fun kni_sfPacket_writeString(packet: NativePtr, string: NativePtr): Unit

fun sfPacket_writeWideString(packet: CValuesRef<sfPacket>?, string: CValuesRef<wchar_tVar>?): Unit {
    return memScoped {
        val _packet = packet?.getPointer(memScope).rawValue
        val _string = string?.getPointer(memScope).rawValue
        val res = kni_sfPacket_writeWideString(_packet, _string)
        res
    }
}

@SymbolName("sfml_kni_sfPacket_writeWideString")
private external fun kni_sfPacket_writeWideString(packet: NativePtr, string: NativePtr): Unit

fun sfSocketSelector_create(): CPointer<sfSocketSelector>? {
    val res = kni_sfSocketSelector_create()
    return interpretCPointer<sfSocketSelector>(res)
}

@SymbolName("sfml_kni_sfSocketSelector_create")
private external fun kni_sfSocketSelector_create(): NativePtr

fun sfSocketSelector_copy(selector: CValuesRef<sfSocketSelector>?): CPointer<sfSocketSelector>? {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_copy(_selector)
        interpretCPointer<sfSocketSelector>(res)
    }
}

@SymbolName("sfml_kni_sfSocketSelector_copy")
private external fun kni_sfSocketSelector_copy(selector: NativePtr): NativePtr

fun sfSocketSelector_destroy(selector: CValuesRef<sfSocketSelector>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_destroy(_selector)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_destroy")
private external fun kni_sfSocketSelector_destroy(selector: NativePtr): Unit

fun sfSocketSelector_addTcpListener(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpListener>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_addTcpListener(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_addTcpListener")
private external fun kni_sfSocketSelector_addTcpListener(selector: NativePtr, socket: NativePtr): Unit

fun sfSocketSelector_addTcpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpSocket>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_addTcpSocket(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_addTcpSocket")
private external fun kni_sfSocketSelector_addTcpSocket(selector: NativePtr, socket: NativePtr): Unit

fun sfSocketSelector_addUdpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfUdpSocket>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_addUdpSocket(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_addUdpSocket")
private external fun kni_sfSocketSelector_addUdpSocket(selector: NativePtr, socket: NativePtr): Unit

fun sfSocketSelector_removeTcpListener(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpListener>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_removeTcpListener(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_removeTcpListener")
private external fun kni_sfSocketSelector_removeTcpListener(selector: NativePtr, socket: NativePtr): Unit

fun sfSocketSelector_removeTcpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpSocket>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_removeTcpSocket(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_removeTcpSocket")
private external fun kni_sfSocketSelector_removeTcpSocket(selector: NativePtr, socket: NativePtr): Unit

fun sfSocketSelector_removeUdpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfUdpSocket>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_removeUdpSocket(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_removeUdpSocket")
private external fun kni_sfSocketSelector_removeUdpSocket(selector: NativePtr, socket: NativePtr): Unit

fun sfSocketSelector_clear(selector: CValuesRef<sfSocketSelector>?): Unit {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_clear(_selector)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_clear")
private external fun kni_sfSocketSelector_clear(selector: NativePtr): Unit

fun sfSocketSelector_wait(selector: CValuesRef<sfSocketSelector>?, timeout: CValue<sfTime>): sfBool {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _timeout = timeout.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_wait(_selector, _timeout)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_wait")
private external fun kni_sfSocketSelector_wait(selector: NativePtr, timeout: NativePtr): Int

fun sfSocketSelector_isTcpListenerReady(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpListener>?): sfBool {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_isTcpListenerReady(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_isTcpListenerReady")
private external fun kni_sfSocketSelector_isTcpListenerReady(selector: NativePtr, socket: NativePtr): Int

fun sfSocketSelector_isTcpSocketReady(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpSocket>?): sfBool {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_isTcpSocketReady(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_isTcpSocketReady")
private external fun kni_sfSocketSelector_isTcpSocketReady(selector: NativePtr, socket: NativePtr): Int

fun sfSocketSelector_isUdpSocketReady(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfUdpSocket>?): sfBool {
    return memScoped {
        val _selector = selector?.getPointer(memScope).rawValue
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfSocketSelector_isUdpSocketReady(_selector, _socket)
        res
    }
}

@SymbolName("sfml_kni_sfSocketSelector_isUdpSocketReady")
private external fun kni_sfSocketSelector_isUdpSocketReady(selector: NativePtr, socket: NativePtr): Int

fun sfTcpListener_create(): CPointer<sfTcpListener>? {
    val res = kni_sfTcpListener_create()
    return interpretCPointer<sfTcpListener>(res)
}

@SymbolName("sfml_kni_sfTcpListener_create")
private external fun kni_sfTcpListener_create(): NativePtr

fun sfTcpListener_destroy(listener: CValuesRef<sfTcpListener>?): Unit {
    return memScoped {
        val _listener = listener?.getPointer(memScope).rawValue
        val res = kni_sfTcpListener_destroy(_listener)
        res
    }
}

@SymbolName("sfml_kni_sfTcpListener_destroy")
private external fun kni_sfTcpListener_destroy(listener: NativePtr): Unit

fun sfTcpListener_setBlocking(listener: CValuesRef<sfTcpListener>?, blocking: sfBool): Unit {
    return memScoped {
        val _listener = listener?.getPointer(memScope).rawValue
        val _blocking = blocking
        val res = kni_sfTcpListener_setBlocking(_listener, _blocking)
        res
    }
}

@SymbolName("sfml_kni_sfTcpListener_setBlocking")
private external fun kni_sfTcpListener_setBlocking(listener: NativePtr, blocking: Int): Unit

fun sfTcpListener_isBlocking(listener: CValuesRef<sfTcpListener>?): sfBool {
    return memScoped {
        val _listener = listener?.getPointer(memScope).rawValue
        val res = kni_sfTcpListener_isBlocking(_listener)
        res
    }
}

@SymbolName("sfml_kni_sfTcpListener_isBlocking")
private external fun kni_sfTcpListener_isBlocking(listener: NativePtr): Int

fun sfTcpListener_getLocalPort(listener: CValuesRef<sfTcpListener>?): Short {
    return memScoped {
        val _listener = listener?.getPointer(memScope).rawValue
        val res = kni_sfTcpListener_getLocalPort(_listener)
        res
    }
}

@SymbolName("sfml_kni_sfTcpListener_getLocalPort")
private external fun kni_sfTcpListener_getLocalPort(listener: NativePtr): Short

fun sfTcpListener_listen(listener: CValuesRef<sfTcpListener>?, port: Short): sfSocketStatus {
    return memScoped {
        val _listener = listener?.getPointer(memScope).rawValue
        val _port = port
        val res = kni_sfTcpListener_listen(_listener, _port)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpListener_listen")
private external fun kni_sfTcpListener_listen(listener: NativePtr, port: Short): Int

fun sfTcpListener_accept(listener: CValuesRef<sfTcpListener>?, connected: CValuesRef<CPointerVar<sfTcpSocket>>?): sfSocketStatus {
    return memScoped {
        val _listener = listener?.getPointer(memScope).rawValue
        val _connected = connected?.getPointer(memScope).rawValue
        val res = kni_sfTcpListener_accept(_listener, _connected)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpListener_accept")
private external fun kni_sfTcpListener_accept(listener: NativePtr, connected: NativePtr): Int

fun sfTcpSocket_create(): CPointer<sfTcpSocket>? {
    val res = kni_sfTcpSocket_create()
    return interpretCPointer<sfTcpSocket>(res)
}

@SymbolName("sfml_kni_sfTcpSocket_create")
private external fun kni_sfTcpSocket_create(): NativePtr

fun sfTcpSocket_destroy(socket: CValuesRef<sfTcpSocket>?): Unit {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_destroy(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfTcpSocket_destroy")
private external fun kni_sfTcpSocket_destroy(socket: NativePtr): Unit

fun sfTcpSocket_setBlocking(socket: CValuesRef<sfTcpSocket>?, blocking: sfBool): Unit {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _blocking = blocking
        val res = kni_sfTcpSocket_setBlocking(_socket, _blocking)
        res
    }
}

@SymbolName("sfml_kni_sfTcpSocket_setBlocking")
private external fun kni_sfTcpSocket_setBlocking(socket: NativePtr, blocking: Int): Unit

fun sfTcpSocket_isBlocking(socket: CValuesRef<sfTcpSocket>?): sfBool {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_isBlocking(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfTcpSocket_isBlocking")
private external fun kni_sfTcpSocket_isBlocking(socket: NativePtr): Int

fun sfTcpSocket_getLocalPort(socket: CValuesRef<sfTcpSocket>?): Short {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_getLocalPort(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfTcpSocket_getLocalPort")
private external fun kni_sfTcpSocket_getLocalPort(socket: NativePtr): Short

fun sfTcpSocket_getRemoteAddress(socket: CValuesRef<sfTcpSocket>?): CValue<sfIpAddress> {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_getRemoteAddress(_socket, alloc<sfIpAddress>().rawPtr)
        interpretPointed<sfIpAddress>(res).readValue()
    }
}

@SymbolName("sfml_kni_sfTcpSocket_getRemoteAddress")
private external fun kni_sfTcpSocket_getRemoteAddress(socket: NativePtr, retValPlacement: NativePtr): NativePtr

fun sfTcpSocket_getRemotePort(socket: CValuesRef<sfTcpSocket>?): Short {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_getRemotePort(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfTcpSocket_getRemotePort")
private external fun kni_sfTcpSocket_getRemotePort(socket: NativePtr): Short

fun sfTcpSocket_connect(socket: CValuesRef<sfTcpSocket>?, host: CValue<sfIpAddress>, port: Short, timeout: CValue<sfTime>): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _host = host.getPointer(memScope).rawValue
        val _port = port
        val _timeout = timeout.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_connect(_socket, _host, _port, _timeout)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpSocket_connect")
private external fun kni_sfTcpSocket_connect(socket: NativePtr, host: NativePtr, port: Short, timeout: NativePtr): Int

fun sfTcpSocket_disconnect(socket: CValuesRef<sfTcpSocket>?): Unit {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_disconnect(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfTcpSocket_disconnect")
private external fun kni_sfTcpSocket_disconnect(socket: NativePtr): Unit

fun sfTcpSocket_send(socket: CValuesRef<sfTcpSocket>?, data: COpaquePointer?, size: size_t): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val _size = size
        val res = kni_sfTcpSocket_send(_socket, _data, _size)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpSocket_send")
private external fun kni_sfTcpSocket_send(socket: NativePtr, data: NativePtr, size: Long): Int

fun sfTcpSocket_sendPartial(socket: CValuesRef<sfTcpSocket>?, data: COpaquePointer?, size: size_t, sent: CValuesRef<size_tVar>?): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val _size = size
        val _sent = sent?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_sendPartial(_socket, _data, _size, _sent)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpSocket_sendPartial")
private external fun kni_sfTcpSocket_sendPartial(socket: NativePtr, data: NativePtr, size: Long, sent: NativePtr): Int

fun sfTcpSocket_receive(socket: CValuesRef<sfTcpSocket>?, data: COpaquePointer?, maxSize: size_t, sizeReceived: CValuesRef<size_tVar>?): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val _maxSize = maxSize
        val _sizeReceived = sizeReceived?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_receive(_socket, _data, _maxSize, _sizeReceived)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpSocket_receive")
private external fun kni_sfTcpSocket_receive(socket: NativePtr, data: NativePtr, maxSize: Long, sizeReceived: NativePtr): Int

fun sfTcpSocket_sendPacket(socket: CValuesRef<sfTcpSocket>?, packet: CValuesRef<sfPacket>?): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_sendPacket(_socket, _packet)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpSocket_sendPacket")
private external fun kni_sfTcpSocket_sendPacket(socket: NativePtr, packet: NativePtr): Int

fun sfTcpSocket_receivePacket(socket: CValuesRef<sfTcpSocket>?, packet: CValuesRef<sfPacket>?): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _packet = packet?.getPointer(memScope).rawValue
        val res = kni_sfTcpSocket_receivePacket(_socket, _packet)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfTcpSocket_receivePacket")
private external fun kni_sfTcpSocket_receivePacket(socket: NativePtr, packet: NativePtr): Int

fun sfUdpSocket_create(): CPointer<sfUdpSocket>? {
    val res = kni_sfUdpSocket_create()
    return interpretCPointer<sfUdpSocket>(res)
}

@SymbolName("sfml_kni_sfUdpSocket_create")
private external fun kni_sfUdpSocket_create(): NativePtr

fun sfUdpSocket_destroy(socket: CValuesRef<sfUdpSocket>?): Unit {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfUdpSocket_destroy(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfUdpSocket_destroy")
private external fun kni_sfUdpSocket_destroy(socket: NativePtr): Unit

fun sfUdpSocket_setBlocking(socket: CValuesRef<sfUdpSocket>?, blocking: sfBool): Unit {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _blocking = blocking
        val res = kni_sfUdpSocket_setBlocking(_socket, _blocking)
        res
    }
}

@SymbolName("sfml_kni_sfUdpSocket_setBlocking")
private external fun kni_sfUdpSocket_setBlocking(socket: NativePtr, blocking: Int): Unit

fun sfUdpSocket_isBlocking(socket: CValuesRef<sfUdpSocket>?): sfBool {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfUdpSocket_isBlocking(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfUdpSocket_isBlocking")
private external fun kni_sfUdpSocket_isBlocking(socket: NativePtr): Int

fun sfUdpSocket_getLocalPort(socket: CValuesRef<sfUdpSocket>?): Short {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfUdpSocket_getLocalPort(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfUdpSocket_getLocalPort")
private external fun kni_sfUdpSocket_getLocalPort(socket: NativePtr): Short

fun sfUdpSocket_bind(socket: CValuesRef<sfUdpSocket>?, port: Short): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _port = port
        val res = kni_sfUdpSocket_bind(_socket, _port)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfUdpSocket_bind")
private external fun kni_sfUdpSocket_bind(socket: NativePtr, port: Short): Int

fun sfUdpSocket_unbind(socket: CValuesRef<sfUdpSocket>?): Unit {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val res = kni_sfUdpSocket_unbind(_socket)
        res
    }
}

@SymbolName("sfml_kni_sfUdpSocket_unbind")
private external fun kni_sfUdpSocket_unbind(socket: NativePtr): Unit

fun sfUdpSocket_send(socket: CValuesRef<sfUdpSocket>?, data: COpaquePointer?, size: size_t, address: CValue<sfIpAddress>, port: Short): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val _size = size
        val _address = address.getPointer(memScope).rawValue
        val _port = port
        val res = kni_sfUdpSocket_send(_socket, _data, _size, _address, _port)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfUdpSocket_send")
private external fun kni_sfUdpSocket_send(socket: NativePtr, data: NativePtr, size: Long, address: NativePtr, port: Short): Int

fun sfUdpSocket_receive(socket: CValuesRef<sfUdpSocket>?, data: COpaquePointer?, maxSize: size_t, sizeReceived: CValuesRef<size_tVar>?, address: CValuesRef<sfIpAddress>?, port: CValuesRef<ShortVar>?): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _data = data.rawValue
        val _maxSize = maxSize
        val _sizeReceived = sizeReceived?.getPointer(memScope).rawValue
        val _address = address?.getPointer(memScope).rawValue
        val _port = port?.getPointer(memScope).rawValue
        val res = kni_sfUdpSocket_receive(_socket, _data, _maxSize, _sizeReceived, _address, _port)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfUdpSocket_receive")
private external fun kni_sfUdpSocket_receive(socket: NativePtr, data: NativePtr, maxSize: Long, sizeReceived: NativePtr, address: NativePtr, port: NativePtr): Int

fun sfUdpSocket_sendPacket(socket: CValuesRef<sfUdpSocket>?, packet: CValuesRef<sfPacket>?, address: CValue<sfIpAddress>, port: Short): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _packet = packet?.getPointer(memScope).rawValue
        val _address = address.getPointer(memScope).rawValue
        val _port = port
        val res = kni_sfUdpSocket_sendPacket(_socket, _packet, _address, _port)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfUdpSocket_sendPacket")
private external fun kni_sfUdpSocket_sendPacket(socket: NativePtr, packet: NativePtr, address: NativePtr, port: Short): Int

fun sfUdpSocket_receivePacket(socket: CValuesRef<sfUdpSocket>?, packet: CValuesRef<sfPacket>?, address: CValuesRef<sfIpAddress>?, port: CValuesRef<ShortVar>?): sfSocketStatus {
    return memScoped {
        val _socket = socket?.getPointer(memScope).rawValue
        val _packet = packet?.getPointer(memScope).rawValue
        val _address = address?.getPointer(memScope).rawValue
        val _port = port?.getPointer(memScope).rawValue
        val res = kni_sfUdpSocket_receivePacket(_socket, _packet, _address, _port)
        sfSocketStatus.byValue(res)
    }
}

@SymbolName("sfml_kni_sfUdpSocket_receivePacket")
private external fun kni_sfUdpSocket_receivePacket(socket: NativePtr, packet: NativePtr, address: NativePtr, port: NativePtr): Int

fun sfUdpSocket_maxDatagramSize(): Int {
    val res = kni_sfUdpSocket_maxDatagramSize()
    return res
}

@SymbolName("sfml_kni_sfUdpSocket_maxDatagramSize")
private external fun kni_sfUdpSocket_maxDatagramSize(): Int

val CSFML_VERSION_MAJOR: Int = 2

val CSFML_VERSION_MINOR: Int = 3

val CSFML_VERSION_PATCH: Int = 0

val sfFalse: Int = 0

val sfTrue: Int = 1

class sfTime(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 8)
    
    var microseconds: sfInt64
        get() = memberAt<sfInt64Var>(0).value
        set(value) { memberAt<sfInt64Var>(0).value = value }
    
}

class sfClock(override val rawPtr: NativePtr) : COpaque

class sfMutex(override val rawPtr: NativePtr) : COpaque

class sfThread(override val rawPtr: NativePtr) : COpaque

class sfInputStream(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(40, 8)
    
    var read: sfInputStreamReadFunc?
        get() = memberAt<sfInputStreamReadFuncVar>(0).value
        set(value) { memberAt<sfInputStreamReadFuncVar>(0).value = value }
    
    var seek: sfInputStreamSeekFunc?
        get() = memberAt<sfInputStreamSeekFuncVar>(8).value
        set(value) { memberAt<sfInputStreamSeekFuncVar>(8).value = value }
    
    var tell: sfInputStreamTellFunc?
        get() = memberAt<sfInputStreamTellFuncVar>(16).value
        set(value) { memberAt<sfInputStreamTellFuncVar>(16).value = value }
    
    var getSize: sfInputStreamGetSizeFunc?
        get() = memberAt<sfInputStreamGetSizeFuncVar>(24).value
        set(value) { memberAt<sfInputStreamGetSizeFuncVar>(24).value = value }
    
    var userData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
}

class sfVector2i(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class sfVector2u(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class sfVector2f(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
}

class sfVector3f(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var z: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
}

class sfMusic(override val rawPtr: NativePtr) : COpaque

class sfSound(override val rawPtr: NativePtr) : COpaque

class sfSoundBuffer(override val rawPtr: NativePtr) : COpaque

class sfSoundBufferRecorder(override val rawPtr: NativePtr) : COpaque

class sfSoundRecorder(override val rawPtr: NativePtr) : COpaque

class sfSoundStream(override val rawPtr: NativePtr) : COpaque

class max_align_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 16)
    
    var __clang_max_align_nonce1: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class sfSoundStreamChunk(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var samples: CPointer<sfInt16Var>?
        get() = memberAt<CPointerVar<sfInt16Var>>(0).value
        set(value) { memberAt<CPointerVar<sfInt16Var>>(0).value = value }
    
    var sampleCount: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfContext(override val rawPtr: NativePtr) : COpaque

class sfWindow(override val rawPtr: NativePtr) : COpaque

class sfJoystickIdentification(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var vendorId: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var productId: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfKeyEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var code: sfKeyCode
        get() = memberAt<sfKeyCodeVar>(4).value
        set(value) { memberAt<sfKeyCodeVar>(4).value = value }
    
    var alt: sfBool
        get() = memberAt<sfBoolVar>(8).value
        set(value) { memberAt<sfBoolVar>(8).value = value }
    
    var control: sfBool
        get() = memberAt<sfBoolVar>(12).value
        set(value) { memberAt<sfBoolVar>(12).value = value }
    
    var shift: sfBool
        get() = memberAt<sfBoolVar>(16).value
        set(value) { memberAt<sfBoolVar>(16).value = value }
    
    var system: sfBool
        get() = memberAt<sfBoolVar>(20).value
        set(value) { memberAt<sfBoolVar>(20).value = value }
    
}

class sfTextEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var unicode: sfUint32
        get() = memberAt<sfUint32Var>(4).value
        set(value) { memberAt<sfUint32Var>(4).value = value }
    
}

class sfMouseMoveEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfMouseButtonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var button: sfMouseButton
        get() = memberAt<sfMouseButton.Var>(4).value
        set(value) { memberAt<sfMouseButton.Var>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfMouseWheelEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var delta: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfMouseWheelScrollEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var wheel: sfMouseWheel
        get() = memberAt<sfMouseWheel.Var>(4).value
        set(value) { memberAt<sfMouseWheel.Var>(4).value = value }
    
    var delta: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
}

class sfJoystickMoveEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var axis: sfJoystickAxis
        get() = memberAt<sfJoystickAxis.Var>(8).value
        set(value) { memberAt<sfJoystickAxis.Var>(8).value = value }
    
    var position: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
}

class sfJoystickButtonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var button: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfJoystickConnectEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class sfSizeEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var width: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfTouchEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var finger: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfSensorEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var sensorType: sfSensorType
        get() = memberAt<sfSensorType.Var>(4).value
        set(value) { memberAt<sfSensorType.Var>(4).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
    var z: Float
        get() = memberAt<FloatVar>(16).value
        set(value) { memberAt<FloatVar>(16).value = value }
    
}

class sfEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    val size: sfSizeEvent
        get() = memberAt(0)
    
    val key: sfKeyEvent
        get() = memberAt(0)
    
    val text: sfTextEvent
        get() = memberAt(0)
    
    val mouseMove: sfMouseMoveEvent
        get() = memberAt(0)
    
    val mouseButton: sfMouseButtonEvent
        get() = memberAt(0)
    
    val mouseWheel: sfMouseWheelEvent
        get() = memberAt(0)
    
    val mouseWheelScroll: sfMouseWheelScrollEvent
        get() = memberAt(0)
    
    val joystickMove: sfJoystickMoveEvent
        get() = memberAt(0)
    
    val joystickButton: sfJoystickButtonEvent
        get() = memberAt(0)
    
    val joystickConnect: sfJoystickConnectEvent
        get() = memberAt(0)
    
    val touch: sfTouchEvent
        get() = memberAt(0)
    
    val sensor: sfSensorEvent
        get() = memberAt(0)
    
}

class sfVideoMode(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var width: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var bitsPerPixel: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfContextSettings(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var depthBits: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var stencilBits: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var antialiasingLevel: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var majorVersion: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var minorVersion: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var attributeFlags: sfUint32
        get() = memberAt<sfUint32Var>(20).value
        set(value) { memberAt<sfUint32Var>(20).value = value }
    
}

class sfBlendMode(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var colorSrcFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(0).value
        set(value) { memberAt<sfBlendFactor.Var>(0).value = value }
    
    var colorDstFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(4).value
        set(value) { memberAt<sfBlendFactor.Var>(4).value = value }
    
    var colorEquation: sfBlendEquation
        get() = memberAt<sfBlendEquation.Var>(8).value
        set(value) { memberAt<sfBlendEquation.Var>(8).value = value }
    
    var alphaSrcFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(12).value
        set(value) { memberAt<sfBlendFactor.Var>(12).value = value }
    
    var alphaDstFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(16).value
        set(value) { memberAt<sfBlendFactor.Var>(16).value = value }
    
    var alphaEquation: sfBlendEquation
        get() = memberAt<sfBlendEquation.Var>(20).value
        set(value) { memberAt<sfBlendEquation.Var>(20).value = value }
    
}

class sfColor(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(4, 1)
    
    var r: sfUint8
        get() = memberAt<sfUint8Var>(0).value
        set(value) { memberAt<sfUint8Var>(0).value = value }
    
    var g: sfUint8
        get() = memberAt<sfUint8Var>(1).value
        set(value) { memberAt<sfUint8Var>(1).value = value }
    
    var b: sfUint8
        get() = memberAt<sfUint8Var>(2).value
        set(value) { memberAt<sfUint8Var>(2).value = value }
    
    var a: sfUint8
        get() = memberAt<sfUint8Var>(3).value
        set(value) { memberAt<sfUint8Var>(3).value = value }
    
}

class sfFloatRect(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var left: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var top: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var width: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var height: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
}

class sfIntRect(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var left: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var top: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var width: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfCircleShape(override val rawPtr: NativePtr) : COpaque

class sfConvexShape(override val rawPtr: NativePtr) : COpaque

class sfFont(override val rawPtr: NativePtr) : COpaque

class sfImage(override val rawPtr: NativePtr) : COpaque

class sfShader(override val rawPtr: NativePtr) : COpaque

class sfRectangleShape(override val rawPtr: NativePtr) : COpaque

class sfRenderTexture(override val rawPtr: NativePtr) : COpaque

class sfRenderWindow(override val rawPtr: NativePtr) : COpaque

class sfShape(override val rawPtr: NativePtr) : COpaque

class sfSprite(override val rawPtr: NativePtr) : COpaque

class sfText(override val rawPtr: NativePtr) : COpaque

class sfTexture(override val rawPtr: NativePtr) : COpaque

class sfTransformable(override val rawPtr: NativePtr) : COpaque

class sfVertexArray(override val rawPtr: NativePtr) : COpaque

class sfView(override val rawPtr: NativePtr) : COpaque

class sfTransform(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(36, 4)
    
    val matrix: CArrayPointer<FloatVar>
        get() = arrayMemberAt(0)
    
}

class sfFontInfo(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 8)
    
    var family: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
}

class sfGlyph(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(36, 4)
    
    var advance: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    val bounds: sfFloatRect
        get() = memberAt(4)
    
    val textureRect: sfIntRect
        get() = memberAt(20)
    
}

class sfRenderStates(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(80, 8)
    
    val blendMode: sfBlendMode
        get() = memberAt(0)
    
    val transform: sfTransform
        get() = memberAt(24)
    
    var texture: CPointer<sfTexture>?
        get() = memberAt<CPointerVar<sfTexture>>(64).value
        set(value) { memberAt<CPointerVar<sfTexture>>(64).value = value }
    
    var shader: CPointer<sfShader>?
        get() = memberAt<CPointerVar<sfShader>>(72).value
        set(value) { memberAt<CPointerVar<sfShader>>(72).value = value }
    
}

class sfVertex(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    val position: sfVector2f
        get() = memberAt(0)
    
    val color: sfColor
        get() = memberAt(8)
    
    val texCoords: sfVector2f
        get() = memberAt(12)
    
}

class sfIpAddress(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 1)
    
    val address: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
}

class sfFtpDirectoryResponse(override val rawPtr: NativePtr) : COpaque

class sfFtpListingResponse(override val rawPtr: NativePtr) : COpaque

class sfFtpResponse(override val rawPtr: NativePtr) : COpaque

class sfFtp(override val rawPtr: NativePtr) : COpaque

class sfHttpRequest(override val rawPtr: NativePtr) : COpaque

class sfHttpResponse(override val rawPtr: NativePtr) : COpaque

class sfHttp(override val rawPtr: NativePtr) : COpaque

class sfPacket(override val rawPtr: NativePtr) : COpaque

class sfSocketSelector(override val rawPtr: NativePtr) : COpaque

class sfTcpListener(override val rawPtr: NativePtr) : COpaque

class sfTcpSocket(override val rawPtr: NativePtr) : COpaque

class sfUdpSocket(override val rawPtr: NativePtr) : COpaque

enum class sfSoundStatus(override val value: Int) : CEnum {
    sfStopped(0),
    sfPaused(1),
    sfPlaying(2),
    ;
    
    companion object {
        fun byValue(value: Int) = sfSoundStatus.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfSoundStatus
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

// enum (anonymous at /usr/include/SFML/Window/Joystick.h:39:1):
val sfJoystickCount: Int = 8
val sfJoystickButtonCount: Int = 32
val sfJoystickAxisCount: Int = 8

enum class sfJoystickAxis(override val value: Int) : CEnum {
    sfJoystickX(0),
    sfJoystickY(1),
    sfJoystickZ(2),
    sfJoystickR(3),
    sfJoystickU(4),
    sfJoystickV(5),
    sfJoystickPovX(6),
    sfJoystickPovY(7),
    ;
    
    companion object {
        fun byValue(value: Int) = sfJoystickAxis.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfJoystickAxis
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfKeyCodeVar = IntVarOf<sfKeyCode>
typealias sfKeyCode = Int

val sfKeyUnknown: sfKeyCode = -1
val sfKeyA: sfKeyCode = 0
val sfKeyB: sfKeyCode = 1
val sfKeyC: sfKeyCode = 2
val sfKeyD: sfKeyCode = 3
val sfKeyE: sfKeyCode = 4
val sfKeyF: sfKeyCode = 5
val sfKeyG: sfKeyCode = 6
val sfKeyH: sfKeyCode = 7
val sfKeyI: sfKeyCode = 8
val sfKeyJ: sfKeyCode = 9
val sfKeyK: sfKeyCode = 10
val sfKeyL: sfKeyCode = 11
val sfKeyM: sfKeyCode = 12
val sfKeyN: sfKeyCode = 13
val sfKeyO: sfKeyCode = 14
val sfKeyP: sfKeyCode = 15
val sfKeyQ: sfKeyCode = 16
val sfKeyR: sfKeyCode = 17
val sfKeyS: sfKeyCode = 18
val sfKeyT: sfKeyCode = 19
val sfKeyU: sfKeyCode = 20
val sfKeyV: sfKeyCode = 21
val sfKeyW: sfKeyCode = 22
val sfKeyX: sfKeyCode = 23
val sfKeyY: sfKeyCode = 24
val sfKeyZ: sfKeyCode = 25
val sfKeyNum0: sfKeyCode = 26
val sfKeyNum1: sfKeyCode = 27
val sfKeyNum2: sfKeyCode = 28
val sfKeyNum3: sfKeyCode = 29
val sfKeyNum4: sfKeyCode = 30
val sfKeyNum5: sfKeyCode = 31
val sfKeyNum6: sfKeyCode = 32
val sfKeyNum7: sfKeyCode = 33
val sfKeyNum8: sfKeyCode = 34
val sfKeyNum9: sfKeyCode = 35
val sfKeyEscape: sfKeyCode = 36
val sfKeyLControl: sfKeyCode = 37
val sfKeyLShift: sfKeyCode = 38
val sfKeyLAlt: sfKeyCode = 39
val sfKeyLSystem: sfKeyCode = 40
val sfKeyRControl: sfKeyCode = 41
val sfKeyRShift: sfKeyCode = 42
val sfKeyRAlt: sfKeyCode = 43
val sfKeyRSystem: sfKeyCode = 44
val sfKeyMenu: sfKeyCode = 45
val sfKeyLBracket: sfKeyCode = 46
val sfKeyRBracket: sfKeyCode = 47
val sfKeySemiColon: sfKeyCode = 48
val sfKeyComma: sfKeyCode = 49
val sfKeyPeriod: sfKeyCode = 50
val sfKeyQuote: sfKeyCode = 51
val sfKeySlash: sfKeyCode = 52
val sfKeyBackSlash: sfKeyCode = 53
val sfKeyTilde: sfKeyCode = 54
val sfKeyEqual: sfKeyCode = 55
val sfKeyDash: sfKeyCode = 56
val sfKeySpace: sfKeyCode = 57
val sfKeyReturn: sfKeyCode = 58
val sfKeyBack: sfKeyCode = 59
val sfKeyTab: sfKeyCode = 60
val sfKeyPageUp: sfKeyCode = 61
val sfKeyPageDown: sfKeyCode = 62
val sfKeyEnd: sfKeyCode = 63
val sfKeyHome: sfKeyCode = 64
val sfKeyInsert: sfKeyCode = 65
val sfKeyDelete: sfKeyCode = 66
val sfKeyAdd: sfKeyCode = 67
val sfKeySubtract: sfKeyCode = 68
val sfKeyMultiply: sfKeyCode = 69
val sfKeyDivide: sfKeyCode = 70
val sfKeyLeft: sfKeyCode = 71
val sfKeyRight: sfKeyCode = 72
val sfKeyUp: sfKeyCode = 73
val sfKeyDown: sfKeyCode = 74
val sfKeyNumpad0: sfKeyCode = 75
val sfKeyNumpad1: sfKeyCode = 76
val sfKeyNumpad2: sfKeyCode = 77
val sfKeyNumpad3: sfKeyCode = 78
val sfKeyNumpad4: sfKeyCode = 79
val sfKeyNumpad5: sfKeyCode = 80
val sfKeyNumpad6: sfKeyCode = 81
val sfKeyNumpad7: sfKeyCode = 82
val sfKeyNumpad8: sfKeyCode = 83
val sfKeyNumpad9: sfKeyCode = 84
val sfKeyF1: sfKeyCode = 85
val sfKeyF2: sfKeyCode = 86
val sfKeyF3: sfKeyCode = 87
val sfKeyF4: sfKeyCode = 88
val sfKeyF5: sfKeyCode = 89
val sfKeyF6: sfKeyCode = 90
val sfKeyF7: sfKeyCode = 91
val sfKeyF8: sfKeyCode = 92
val sfKeyF9: sfKeyCode = 93
val sfKeyF10: sfKeyCode = 94
val sfKeyF11: sfKeyCode = 95
val sfKeyF12: sfKeyCode = 96
val sfKeyF13: sfKeyCode = 97
val sfKeyF14: sfKeyCode = 98
val sfKeyF15: sfKeyCode = 99
val sfKeyPause: sfKeyCode = 100
val sfKeyCount: sfKeyCode = 101

enum class sfMouseButton(override val value: Int) : CEnum {
    sfMouseLeft(0),
    sfMouseRight(1),
    sfMouseMiddle(2),
    sfMouseXButton1(3),
    sfMouseXButton2(4),
    sfMouseButtonCount(5),
    ;
    
    companion object {
        fun byValue(value: Int) = sfMouseButton.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfMouseButton
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfMouseWheel(override val value: Int) : CEnum {
    sfMouseVerticalWheel(0),
    sfMouseHorizontalWheel(1),
    ;
    
    companion object {
        fun byValue(value: Int) = sfMouseWheel.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfMouseWheel
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfSensorType(override val value: Int) : CEnum {
    sfSensorAccelerometer(0),
    sfSensorGyroscope(1),
    sfSensorMagnetometer(2),
    sfSensorGravity(3),
    sfSensorUserAcceleration(4),
    sfSensorOrientation(5),
    sfSensorCount(6),
    ;
    
    companion object {
        fun byValue(value: Int) = sfSensorType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfSensorType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfEventType(override val value: Int) : CEnum {
    sfEvtClosed(0),
    sfEvtResized(1),
    sfEvtLostFocus(2),
    sfEvtGainedFocus(3),
    sfEvtTextEntered(4),
    sfEvtKeyPressed(5),
    sfEvtKeyReleased(6),
    sfEvtMouseWheelMoved(7),
    sfEvtMouseWheelScrolled(8),
    sfEvtMouseButtonPressed(9),
    sfEvtMouseButtonReleased(10),
    sfEvtMouseMoved(11),
    sfEvtMouseEntered(12),
    sfEvtMouseLeft(13),
    sfEvtJoystickButtonPressed(14),
    sfEvtJoystickButtonReleased(15),
    sfEvtJoystickMoved(16),
    sfEvtJoystickConnected(17),
    sfEvtJoystickDisconnected(18),
    sfEvtTouchBegan(19),
    sfEvtTouchMoved(20),
    sfEvtTouchEnded(21),
    sfEvtSensorChanged(22),
    sfEvtCount(23),
    ;
    
    companion object {
        fun byValue(value: Int) = sfEventType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfEventType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfWindowStyleVar = IntVarOf<sfWindowStyle>
typealias sfWindowStyle = Int

val sfNone: sfWindowStyle = 0
val sfTitlebar: sfWindowStyle = 1
val sfResize: sfWindowStyle = 2
val sfClose: sfWindowStyle = 4
val sfFullscreen: sfWindowStyle = 8
val sfDefaultStyle: sfWindowStyle = 7

typealias sfContextAttributeVar = IntVarOf<sfContextAttribute>
typealias sfContextAttribute = Int

val sfContextDefault: sfContextAttribute = 0
val sfContextCore: sfContextAttribute = 1
val sfContextDebug: sfContextAttribute = 4

enum class sfBlendFactor(override val value: Int) : CEnum {
    sfBlendFactorZero(0),
    sfBlendFactorOne(1),
    sfBlendFactorSrcColor(2),
    sfBlendFactorOneMinusSrcColor(3),
    sfBlendFactorDstColor(4),
    sfBlendFactorOneMinusDstColor(5),
    sfBlendFactorSrcAlpha(6),
    sfBlendFactorOneMinusSrcAlpha(7),
    sfBlendFactorDstAlpha(8),
    sfBlendFactorOneMinusDstAlpha(9),
    ;
    
    companion object {
        fun byValue(value: Int) = sfBlendFactor.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfBlendFactor
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfBlendEquation(override val value: Int) : CEnum {
    sfBlendEquationAdd(0),
    sfBlendEquationSubtract(1),
    ;
    
    companion object {
        fun byValue(value: Int) = sfBlendEquation.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfBlendEquation
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfPrimitiveType(override val value: Int) : CEnum {
    sfPoints(0),
    sfLines(1),
    sfLinesStrip(2),
    sfTriangles(3),
    sfTrianglesStrip(4),
    sfTrianglesFan(5),
    sfQuads(6),
    ;
    
    companion object {
        fun byValue(value: Int) = sfPrimitiveType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfPrimitiveType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfTextStyleVar = IntVarOf<sfTextStyle>
typealias sfTextStyle = Int

val sfTextRegular: sfTextStyle = 0
val sfTextBold: sfTextStyle = 1
val sfTextItalic: sfTextStyle = 2
val sfTextUnderlined: sfTextStyle = 4
val sfTextStrikeThrough: sfTextStyle = 8

enum class sfFtpTransferMode(override val value: Int) : CEnum {
    sfFtpBinary(0),
    sfFtpAscii(1),
    sfFtpEbcdic(2),
    ;
    
    companion object {
        fun byValue(value: Int) = sfFtpTransferMode.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfFtpTransferMode
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfFtpStatusVar = IntVarOf<sfFtpStatus>
typealias sfFtpStatus = Int

val sfFtpRestartMarkerReply: sfFtpStatus = 110
val sfFtpServiceReadySoon: sfFtpStatus = 120
val sfFtpDataConnectionAlreadyOpened: sfFtpStatus = 125
val sfFtpOpeningDataConnection: sfFtpStatus = 150
val sfFtpOk: sfFtpStatus = 200
val sfFtpPointlessCommand: sfFtpStatus = 202
val sfFtpSystemStatus: sfFtpStatus = 211
val sfFtpDirectoryStatus: sfFtpStatus = 212
val sfFtpFileStatus: sfFtpStatus = 213
val sfFtpHelpMessage: sfFtpStatus = 214
val sfFtpSystemType: sfFtpStatus = 215
val sfFtpServiceReady: sfFtpStatus = 220
val sfFtpClosingConnection: sfFtpStatus = 221
val sfFtpDataConnectionOpened: sfFtpStatus = 225
val sfFtpClosingDataConnection: sfFtpStatus = 226
val sfFtpEnteringPassiveMode: sfFtpStatus = 227
val sfFtpLoggedIn: sfFtpStatus = 230
val sfFtpFileActionOk: sfFtpStatus = 250
val sfFtpDirectoryOk: sfFtpStatus = 257
val sfFtpNeedPassword: sfFtpStatus = 331
val sfFtpNeedAccountToLogIn: sfFtpStatus = 332
val sfFtpNeedInformation: sfFtpStatus = 350
val sfFtpServiceUnavailable: sfFtpStatus = 421
val sfFtpDataConnectionUnavailable: sfFtpStatus = 425
val sfFtpTransferAborted: sfFtpStatus = 426
val sfFtpFileActionAborted: sfFtpStatus = 450
val sfFtpLocalError: sfFtpStatus = 451
val sfFtpInsufficientStorageSpace: sfFtpStatus = 452
val sfFtpCommandUnknown: sfFtpStatus = 500
val sfFtpParametersUnknown: sfFtpStatus = 501
val sfFtpCommandNotImplemented: sfFtpStatus = 502
val sfFtpBadCommandSequence: sfFtpStatus = 503
val sfFtpParameterNotImplemented: sfFtpStatus = 504
val sfFtpNotLoggedIn: sfFtpStatus = 530
val sfFtpNeedAccountToStore: sfFtpStatus = 532
val sfFtpFileUnavailable: sfFtpStatus = 550
val sfFtpPageTypeUnknown: sfFtpStatus = 551
val sfFtpNotEnoughMemory: sfFtpStatus = 552
val sfFtpFilenameNotAllowed: sfFtpStatus = 553
val sfFtpInvalidResponse: sfFtpStatus = 1000
val sfFtpConnectionFailed: sfFtpStatus = 1001
val sfFtpConnectionClosed: sfFtpStatus = 1002
val sfFtpInvalidFile: sfFtpStatus = 1003

enum class sfHttpMethod(override val value: Int) : CEnum {
    sfHttpGet(0),
    sfHttpPost(1),
    sfHttpHead(2),
    sfHttpPut(3),
    sfHttpDelete(4),
    ;
    
    companion object {
        fun byValue(value: Int) = sfHttpMethod.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfHttpMethod
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfHttpStatusVar = IntVarOf<sfHttpStatus>
typealias sfHttpStatus = Int

val sfHttpOk: sfHttpStatus = 200
val sfHttpCreated: sfHttpStatus = 201
val sfHttpAccepted: sfHttpStatus = 202
val sfHttpNoContent: sfHttpStatus = 204
val sfHttpResetContent: sfHttpStatus = 205
val sfHttpPartialContent: sfHttpStatus = 206
val sfHttpMultipleChoices: sfHttpStatus = 300
val sfHttpMovedPermanently: sfHttpStatus = 301
val sfHttpMovedTemporarily: sfHttpStatus = 302
val sfHttpNotModified: sfHttpStatus = 304
val sfHttpBadRequest: sfHttpStatus = 400
val sfHttpUnauthorized: sfHttpStatus = 401
val sfHttpForbidden: sfHttpStatus = 403
val sfHttpNotFound: sfHttpStatus = 404
val sfHttpRangeNotSatisfiable: sfHttpStatus = 407
val sfHttpInternalServerError: sfHttpStatus = 500
val sfHttpNotImplemented: sfHttpStatus = 501
val sfHttpBadGateway: sfHttpStatus = 502
val sfHttpServiceNotAvailable: sfHttpStatus = 503
val sfHttpGatewayTimeout: sfHttpStatus = 504
val sfHttpVersionNotSupported: sfHttpStatus = 505
val sfHttpInvalidResponse: sfHttpStatus = 1000
val sfHttpConnectionFailed: sfHttpStatus = 1001

enum class sfSocketStatus(override val value: Int) : CEnum {
    sfSocketDone(0),
    sfSocketNotReady(1),
    sfSocketPartial(2),
    sfSocketDisconnected(3),
    sfSocketError(4),
    ;
    
    companion object {
        fun byValue(value: Int) = sfSocketStatus.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfSocketStatus
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfBoolVar = IntVarOf<sfBool>
typealias sfBool = Int

typealias sfInt8Var = ByteVarOf<sfInt8>
typealias sfInt8 = Byte

typealias sfUint8Var = ByteVarOf<sfUint8>
typealias sfUint8 = Byte

typealias sfInt16Var = ShortVarOf<sfInt16>
typealias sfInt16 = Short

typealias sfUint16Var = ShortVarOf<sfUint16>
typealias sfUint16 = Short

typealias sfInt32Var = IntVarOf<sfInt32>
typealias sfInt32 = Int

typealias sfUint32Var = IntVarOf<sfUint32>
typealias sfUint32 = Int

typealias sfInt64Var = LongVarOf<sfInt64>
typealias sfInt64 = Long

typealias sfUint64Var = LongVarOf<sfUint64>
typealias sfUint64 = Long

typealias sfInputStreamReadFuncVar = CPointerVarOf<sfInputStreamReadFunc>
typealias sfInputStreamReadFunc = CPointer<CFunction<(COpaquePointer?, sfInt64, COpaquePointer?) -> sfInt64>>

typealias sfInputStreamSeekFuncVar = CPointerVarOf<sfInputStreamSeekFunc>
typealias sfInputStreamSeekFunc = CPointer<CFunction<(sfInt64, COpaquePointer?) -> sfInt64>>

typealias sfInputStreamTellFuncVar = CPointerVarOf<sfInputStreamTellFunc>
typealias sfInputStreamTellFunc = CPointer<CFunction<(COpaquePointer?) -> sfInt64>>

typealias sfInputStreamGetSizeFuncVar = CPointerVarOf<sfInputStreamGetSizeFunc>
typealias sfInputStreamGetSizeFunc = CPointer<CFunction<(COpaquePointer?) -> sfInt64>>

typealias ptrdiff_tVar = LongVarOf<ptrdiff_t>
typealias ptrdiff_t = Long

typealias size_tVar = LongVarOf<size_t>
typealias size_t = Long

typealias wchar_tVar = IntVarOf<wchar_t>
typealias wchar_t = Int

typealias sfSoundRecorderStartCallbackVar = CPointerVarOf<sfSoundRecorderStartCallback>
typealias sfSoundRecorderStartCallback = CPointer<CFunction<(COpaquePointer?) -> sfBool>>

typealias sfSoundRecorderProcessCallbackVar = CPointerVarOf<sfSoundRecorderProcessCallback>
typealias sfSoundRecorderProcessCallback = CPointer<CFunction<(CPointer<sfInt16Var>?, size_t, COpaquePointer?) -> sfBool>>

typealias sfSoundRecorderStopCallbackVar = CPointerVarOf<sfSoundRecorderStopCallback>
typealias sfSoundRecorderStopCallback = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias sfSoundStreamGetDataCallbackVar = CPointerVarOf<sfSoundStreamGetDataCallback>
typealias sfSoundStreamGetDataCallback = CPointer<CFunction<(CPointer<sfSoundStreamChunk>?, COpaquePointer?) -> sfBool>>

typealias sfSoundStreamSeekCallbackVar = CPointerVarOf<sfSoundStreamSeekCallback>
typealias sfSoundStreamSeekCallback = CPointer<CFunction<(CValue<sfTime>, COpaquePointer?) -> Unit>>

typealias sfWindowHandleVar = LongVarOf<sfWindowHandle>
typealias sfWindowHandle = Long

typealias sfShapeGetPointCountCallbackVar = CPointerVarOf<sfShapeGetPointCountCallback>
typealias sfShapeGetPointCountCallback = CPointer<CFunction<(COpaquePointer?) -> size_t>>

typealias sfShapeGetPointCallbackVar = CPointerVarOf<sfShapeGetPointCallback>
typealias sfShapeGetPointCallback = CPointer<CFunction<(size_t, COpaquePointer?) -> CValue<sfVector2f>>>

