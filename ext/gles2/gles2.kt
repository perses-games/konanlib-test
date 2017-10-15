@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package gles2

import konan.SymbolName
import kotlinx.cinterop.*

fun glActiveTexture(texture: GLenum): Unit {
    val _texture = texture
    val res = kni_glActiveTexture(_texture)
    return res
}

@SymbolName("gles2_kni_glActiveTexture")
private external fun kni_glActiveTexture(texture: Int): Unit

fun glAttachShader(program: GLuint, shader: GLuint): Unit {
    val _program = program
    val _shader = shader
    val res = kni_glAttachShader(_program, _shader)
    return res
}

@SymbolName("gles2_kni_glAttachShader")
private external fun kni_glAttachShader(program: Int, shader: Int): Unit

fun glBindAttribLocation(program: GLuint, index: GLuint, name: String?): Unit {
    return memScoped {
        val _program = program
        val _index = index
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_glBindAttribLocation(_program, _index, _name)
        res
    }
}

@SymbolName("gles2_kni_glBindAttribLocation")
private external fun kni_glBindAttribLocation(program: Int, index: Int, name: NativePtr): Unit

fun glBindBuffer(target: GLenum, buffer: GLuint): Unit {
    val _target = target
    val _buffer = buffer
    val res = kni_glBindBuffer(_target, _buffer)
    return res
}

@SymbolName("gles2_kni_glBindBuffer")
private external fun kni_glBindBuffer(target: Int, buffer: Int): Unit

fun glBindFramebuffer(target: GLenum, framebuffer: GLuint): Unit {
    val _target = target
    val _framebuffer = framebuffer
    val res = kni_glBindFramebuffer(_target, _framebuffer)
    return res
}

@SymbolName("gles2_kni_glBindFramebuffer")
private external fun kni_glBindFramebuffer(target: Int, framebuffer: Int): Unit

fun glBindRenderbuffer(target: GLenum, renderbuffer: GLuint): Unit {
    val _target = target
    val _renderbuffer = renderbuffer
    val res = kni_glBindRenderbuffer(_target, _renderbuffer)
    return res
}

@SymbolName("gles2_kni_glBindRenderbuffer")
private external fun kni_glBindRenderbuffer(target: Int, renderbuffer: Int): Unit

fun glBindTexture(target: GLenum, texture: GLuint): Unit {
    val _target = target
    val _texture = texture
    val res = kni_glBindTexture(_target, _texture)
    return res
}

@SymbolName("gles2_kni_glBindTexture")
private external fun kni_glBindTexture(target: Int, texture: Int): Unit

fun glBlendColor(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit {
    val _red = red
    val _green = green
    val _blue = blue
    val _alpha = alpha
    val res = kni_glBlendColor(_red, _green, _blue, _alpha)
    return res
}

@SymbolName("gles2_kni_glBlendColor")
private external fun kni_glBlendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit

fun glBlendEquation(mode: GLenum): Unit {
    val _mode = mode
    val res = kni_glBlendEquation(_mode)
    return res
}

@SymbolName("gles2_kni_glBlendEquation")
private external fun kni_glBlendEquation(mode: Int): Unit

fun glBlendEquationSeparate(modeRGB: GLenum, modeAlpha: GLenum): Unit {
    val _modeRGB = modeRGB
    val _modeAlpha = modeAlpha
    val res = kni_glBlendEquationSeparate(_modeRGB, _modeAlpha)
    return res
}

@SymbolName("gles2_kni_glBlendEquationSeparate")
private external fun kni_glBlendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit

fun glBlendFunc(sfactor: GLenum, dfactor: GLenum): Unit {
    val _sfactor = sfactor
    val _dfactor = dfactor
    val res = kni_glBlendFunc(_sfactor, _dfactor)
    return res
}

@SymbolName("gles2_kni_glBlendFunc")
private external fun kni_glBlendFunc(sfactor: Int, dfactor: Int): Unit

fun glBlendFuncSeparate(sfactorRGB: GLenum, dfactorRGB: GLenum, sfactorAlpha: GLenum, dfactorAlpha: GLenum): Unit {
    val _sfactorRGB = sfactorRGB
    val _dfactorRGB = dfactorRGB
    val _sfactorAlpha = sfactorAlpha
    val _dfactorAlpha = dfactorAlpha
    val res = kni_glBlendFuncSeparate(_sfactorRGB, _dfactorRGB, _sfactorAlpha, _dfactorAlpha)
    return res
}

@SymbolName("gles2_kni_glBlendFuncSeparate")
private external fun kni_glBlendFuncSeparate(sfactorRGB: Int, dfactorRGB: Int, sfactorAlpha: Int, dfactorAlpha: Int): Unit

fun glBufferData(target: GLenum, size: GLsizeiptr, data: COpaquePointer?, usage: GLenum): Unit {
    val _target = target
    val _size = size
    val _data = data.rawValue
    val _usage = usage
    val res = kni_glBufferData(_target, _size, _data, _usage)
    return res
}

@SymbolName("gles2_kni_glBufferData")
private external fun kni_glBufferData(target: Int, size: Long, data: NativePtr, usage: Int): Unit

fun glBufferSubData(target: GLenum, offset: GLintptr, size: GLsizeiptr, data: COpaquePointer?): Unit {
    val _target = target
    val _offset = offset
    val _size = size
    val _data = data.rawValue
    val res = kni_glBufferSubData(_target, _offset, _size, _data)
    return res
}

@SymbolName("gles2_kni_glBufferSubData")
private external fun kni_glBufferSubData(target: Int, offset: Long, size: Long, data: NativePtr): Unit

fun glCheckFramebufferStatus(target: GLenum): GLenum {
    val _target = target
    val res = kni_glCheckFramebufferStatus(_target)
    return res
}

@SymbolName("gles2_kni_glCheckFramebufferStatus")
private external fun kni_glCheckFramebufferStatus(target: Int): Int

fun glClear(mask: GLbitfield): Unit {
    val _mask = mask
    val res = kni_glClear(_mask)
    return res
}

@SymbolName("gles2_kni_glClear")
private external fun kni_glClear(mask: Int): Unit

fun glClearColor(red: GLfloat, green: GLfloat, blue: GLfloat, alpha: GLfloat): Unit {
    val _red = red
    val _green = green
    val _blue = blue
    val _alpha = alpha
    val res = kni_glClearColor(_red, _green, _blue, _alpha)
    return res
}

@SymbolName("gles2_kni_glClearColor")
private external fun kni_glClearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit

fun glClearDepthf(d: GLfloat): Unit {
    val _d = d
    val res = kni_glClearDepthf(_d)
    return res
}

@SymbolName("gles2_kni_glClearDepthf")
private external fun kni_glClearDepthf(d: Float): Unit

fun glClearStencil(s: GLint): Unit {
    val _s = s
    val res = kni_glClearStencil(_s)
    return res
}

@SymbolName("gles2_kni_glClearStencil")
private external fun kni_glClearStencil(s: Int): Unit

fun glColorMask(red: GLboolean, green: GLboolean, blue: GLboolean, alpha: GLboolean): Unit {
    val _red = red
    val _green = green
    val _blue = blue
    val _alpha = alpha
    val res = kni_glColorMask(_red, _green, _blue, _alpha)
    return res
}

@SymbolName("gles2_kni_glColorMask")
private external fun kni_glColorMask(red: Byte, green: Byte, blue: Byte, alpha: Byte): Unit

fun glCompileShader(shader: GLuint): Unit {
    val _shader = shader
    val res = kni_glCompileShader(_shader)
    return res
}

@SymbolName("gles2_kni_glCompileShader")
private external fun kni_glCompileShader(shader: Int): Unit

fun glCompressedTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, width: GLsizei, height: GLsizei, border: GLint, imageSize: GLsizei, data: COpaquePointer?): Unit {
    val _target = target
    val _level = level
    val _internalformat = internalformat
    val _width = width
    val _height = height
    val _border = border
    val _imageSize = imageSize
    val _data = data.rawValue
    val res = kni_glCompressedTexImage2D(_target, _level, _internalformat, _width, _height, _border, _imageSize, _data)
    return res
}

@SymbolName("gles2_kni_glCompressedTexImage2D")
private external fun kni_glCompressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, data: NativePtr): Unit

fun glCompressedTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, imageSize: GLsizei, data: COpaquePointer?): Unit {
    val _target = target
    val _level = level
    val _xoffset = xoffset
    val _yoffset = yoffset
    val _width = width
    val _height = height
    val _format = format
    val _imageSize = imageSize
    val _data = data.rawValue
    val res = kni_glCompressedTexSubImage2D(_target, _level, _xoffset, _yoffset, _width, _height, _format, _imageSize, _data)
    return res
}

@SymbolName("gles2_kni_glCompressedTexSubImage2D")
private external fun kni_glCompressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, imageSize: Int, data: NativePtr): Unit

fun glCopyTexImage2D(target: GLenum, level: GLint, internalformat: GLenum, x: GLint, y: GLint, width: GLsizei, height: GLsizei, border: GLint): Unit {
    val _target = target
    val _level = level
    val _internalformat = internalformat
    val _x = x
    val _y = y
    val _width = width
    val _height = height
    val _border = border
    val res = kni_glCopyTexImage2D(_target, _level, _internalformat, _x, _y, _width, _height, _border)
    return res
}

@SymbolName("gles2_kni_glCopyTexImage2D")
private external fun kni_glCopyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit

fun glCopyTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    val _target = target
    val _level = level
    val _xoffset = xoffset
    val _yoffset = yoffset
    val _x = x
    val _y = y
    val _width = width
    val _height = height
    val res = kni_glCopyTexSubImage2D(_target, _level, _xoffset, _yoffset, _x, _y, _width, _height)
    return res
}

@SymbolName("gles2_kni_glCopyTexSubImage2D")
private external fun kni_glCopyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit

fun glCreateProgram(): GLuint {
    val res = kni_glCreateProgram()
    return res
}

@SymbolName("gles2_kni_glCreateProgram")
private external fun kni_glCreateProgram(): Int

fun glCreateShader(type: GLenum): GLuint {
    val _type = type
    val res = kni_glCreateShader(_type)
    return res
}

@SymbolName("gles2_kni_glCreateShader")
private external fun kni_glCreateShader(type: Int): Int

fun glCullFace(mode: GLenum): Unit {
    val _mode = mode
    val res = kni_glCullFace(_mode)
    return res
}

@SymbolName("gles2_kni_glCullFace")
private external fun kni_glCullFace(mode: Int): Unit

fun glDeleteBuffers(n: GLsizei, buffers: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _buffers = buffers?.getPointer(memScope).rawValue
        val res = kni_glDeleteBuffers(_n, _buffers)
        res
    }
}

@SymbolName("gles2_kni_glDeleteBuffers")
private external fun kni_glDeleteBuffers(n: Int, buffers: NativePtr): Unit

fun glDeleteFramebuffers(n: GLsizei, framebuffers: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _framebuffers = framebuffers?.getPointer(memScope).rawValue
        val res = kni_glDeleteFramebuffers(_n, _framebuffers)
        res
    }
}

@SymbolName("gles2_kni_glDeleteFramebuffers")
private external fun kni_glDeleteFramebuffers(n: Int, framebuffers: NativePtr): Unit

fun glDeleteProgram(program: GLuint): Unit {
    val _program = program
    val res = kni_glDeleteProgram(_program)
    return res
}

@SymbolName("gles2_kni_glDeleteProgram")
private external fun kni_glDeleteProgram(program: Int): Unit

fun glDeleteRenderbuffers(n: GLsizei, renderbuffers: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _renderbuffers = renderbuffers?.getPointer(memScope).rawValue
        val res = kni_glDeleteRenderbuffers(_n, _renderbuffers)
        res
    }
}

@SymbolName("gles2_kni_glDeleteRenderbuffers")
private external fun kni_glDeleteRenderbuffers(n: Int, renderbuffers: NativePtr): Unit

fun glDeleteShader(shader: GLuint): Unit {
    val _shader = shader
    val res = kni_glDeleteShader(_shader)
    return res
}

@SymbolName("gles2_kni_glDeleteShader")
private external fun kni_glDeleteShader(shader: Int): Unit

fun glDeleteTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _textures = textures?.getPointer(memScope).rawValue
        val res = kni_glDeleteTextures(_n, _textures)
        res
    }
}

@SymbolName("gles2_kni_glDeleteTextures")
private external fun kni_glDeleteTextures(n: Int, textures: NativePtr): Unit

fun glDepthFunc(func: GLenum): Unit {
    val _func = func
    val res = kni_glDepthFunc(_func)
    return res
}

@SymbolName("gles2_kni_glDepthFunc")
private external fun kni_glDepthFunc(func: Int): Unit

fun glDepthMask(flag: GLboolean): Unit {
    val _flag = flag
    val res = kni_glDepthMask(_flag)
    return res
}

@SymbolName("gles2_kni_glDepthMask")
private external fun kni_glDepthMask(flag: Byte): Unit

fun glDepthRangef(n: GLfloat, f: GLfloat): Unit {
    val _n = n
    val _f = f
    val res = kni_glDepthRangef(_n, _f)
    return res
}

@SymbolName("gles2_kni_glDepthRangef")
private external fun kni_glDepthRangef(n: Float, f: Float): Unit

fun glDetachShader(program: GLuint, shader: GLuint): Unit {
    val _program = program
    val _shader = shader
    val res = kni_glDetachShader(_program, _shader)
    return res
}

@SymbolName("gles2_kni_glDetachShader")
private external fun kni_glDetachShader(program: Int, shader: Int): Unit

fun glDisable(cap: GLenum): Unit {
    val _cap = cap
    val res = kni_glDisable(_cap)
    return res
}

@SymbolName("gles2_kni_glDisable")
private external fun kni_glDisable(cap: Int): Unit

fun glDisableVertexAttribArray(index: GLuint): Unit {
    val _index = index
    val res = kni_glDisableVertexAttribArray(_index)
    return res
}

@SymbolName("gles2_kni_glDisableVertexAttribArray")
private external fun kni_glDisableVertexAttribArray(index: Int): Unit

fun glDrawArrays(mode: GLenum, first: GLint, count: GLsizei): Unit {
    val _mode = mode
    val _first = first
    val _count = count
    val res = kni_glDrawArrays(_mode, _first, _count)
    return res
}

@SymbolName("gles2_kni_glDrawArrays")
private external fun kni_glDrawArrays(mode: Int, first: Int, count: Int): Unit

fun glDrawElements(mode: GLenum, count: GLsizei, type: GLenum, indices: COpaquePointer?): Unit {
    val _mode = mode
    val _count = count
    val _type = type
    val _indices = indices.rawValue
    val res = kni_glDrawElements(_mode, _count, _type, _indices)
    return res
}

@SymbolName("gles2_kni_glDrawElements")
private external fun kni_glDrawElements(mode: Int, count: Int, type: Int, indices: NativePtr): Unit

fun glEnable(cap: GLenum): Unit {
    val _cap = cap
    val res = kni_glEnable(_cap)
    return res
}

@SymbolName("gles2_kni_glEnable")
private external fun kni_glEnable(cap: Int): Unit

fun glEnableVertexAttribArray(index: GLuint): Unit {
    val _index = index
    val res = kni_glEnableVertexAttribArray(_index)
    return res
}

@SymbolName("gles2_kni_glEnableVertexAttribArray")
private external fun kni_glEnableVertexAttribArray(index: Int): Unit

fun glFinish(): Unit {
    val res = kni_glFinish()
    return res
}

@SymbolName("gles2_kni_glFinish")
private external fun kni_glFinish(): Unit

fun glFlush(): Unit {
    val res = kni_glFlush()
    return res
}

@SymbolName("gles2_kni_glFlush")
private external fun kni_glFlush(): Unit

fun glFramebufferRenderbuffer(target: GLenum, attachment: GLenum, renderbuffertarget: GLenum, renderbuffer: GLuint): Unit {
    val _target = target
    val _attachment = attachment
    val _renderbuffertarget = renderbuffertarget
    val _renderbuffer = renderbuffer
    val res = kni_glFramebufferRenderbuffer(_target, _attachment, _renderbuffertarget, _renderbuffer)
    return res
}

@SymbolName("gles2_kni_glFramebufferRenderbuffer")
private external fun kni_glFramebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: Int): Unit

fun glFramebufferTexture2D(target: GLenum, attachment: GLenum, textarget: GLenum, texture: GLuint, level: GLint): Unit {
    val _target = target
    val _attachment = attachment
    val _textarget = textarget
    val _texture = texture
    val _level = level
    val res = kni_glFramebufferTexture2D(_target, _attachment, _textarget, _texture, _level)
    return res
}

@SymbolName("gles2_kni_glFramebufferTexture2D")
private external fun kni_glFramebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Int, level: Int): Unit

fun glFrontFace(mode: GLenum): Unit {
    val _mode = mode
    val res = kni_glFrontFace(_mode)
    return res
}

@SymbolName("gles2_kni_glFrontFace")
private external fun kni_glFrontFace(mode: Int): Unit

fun glGenBuffers(n: GLsizei, buffers: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _buffers = buffers?.getPointer(memScope).rawValue
        val res = kni_glGenBuffers(_n, _buffers)
        res
    }
}

@SymbolName("gles2_kni_glGenBuffers")
private external fun kni_glGenBuffers(n: Int, buffers: NativePtr): Unit

fun glGenerateMipmap(target: GLenum): Unit {
    val _target = target
    val res = kni_glGenerateMipmap(_target)
    return res
}

@SymbolName("gles2_kni_glGenerateMipmap")
private external fun kni_glGenerateMipmap(target: Int): Unit

fun glGenFramebuffers(n: GLsizei, framebuffers: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _framebuffers = framebuffers?.getPointer(memScope).rawValue
        val res = kni_glGenFramebuffers(_n, _framebuffers)
        res
    }
}

@SymbolName("gles2_kni_glGenFramebuffers")
private external fun kni_glGenFramebuffers(n: Int, framebuffers: NativePtr): Unit

fun glGenRenderbuffers(n: GLsizei, renderbuffers: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _renderbuffers = renderbuffers?.getPointer(memScope).rawValue
        val res = kni_glGenRenderbuffers(_n, _renderbuffers)
        res
    }
}

@SymbolName("gles2_kni_glGenRenderbuffers")
private external fun kni_glGenRenderbuffers(n: Int, renderbuffers: NativePtr): Unit

fun glGenTextures(n: GLsizei, textures: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _n = n
        val _textures = textures?.getPointer(memScope).rawValue
        val res = kni_glGenTextures(_n, _textures)
        res
    }
}

@SymbolName("gles2_kni_glGenTextures")
private external fun kni_glGenTextures(n: Int, textures: NativePtr): Unit

fun glGetActiveAttrib(program: GLuint, index: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, size: CValuesRef<GLintVar>?, type: CValuesRef<GLenumVar>?, name: CValuesRef<GLcharVar>?): Unit {
    return memScoped {
        val _program = program
        val _index = index
        val _bufSize = bufSize
        val _length = length?.getPointer(memScope).rawValue
        val _size = size?.getPointer(memScope).rawValue
        val _type = type?.getPointer(memScope).rawValue
        val _name = name?.getPointer(memScope).rawValue
        val res = kni_glGetActiveAttrib(_program, _index, _bufSize, _length, _size, _type, _name)
        res
    }
}

@SymbolName("gles2_kni_glGetActiveAttrib")
private external fun kni_glGetActiveAttrib(program: Int, index: Int, bufSize: Int, length: NativePtr, size: NativePtr, type: NativePtr, name: NativePtr): Unit

fun glGetActiveUniform(program: GLuint, index: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, size: CValuesRef<GLintVar>?, type: CValuesRef<GLenumVar>?, name: CValuesRef<GLcharVar>?): Unit {
    return memScoped {
        val _program = program
        val _index = index
        val _bufSize = bufSize
        val _length = length?.getPointer(memScope).rawValue
        val _size = size?.getPointer(memScope).rawValue
        val _type = type?.getPointer(memScope).rawValue
        val _name = name?.getPointer(memScope).rawValue
        val res = kni_glGetActiveUniform(_program, _index, _bufSize, _length, _size, _type, _name)
        res
    }
}

@SymbolName("gles2_kni_glGetActiveUniform")
private external fun kni_glGetActiveUniform(program: Int, index: Int, bufSize: Int, length: NativePtr, size: NativePtr, type: NativePtr, name: NativePtr): Unit

fun glGetAttachedShaders(program: GLuint, maxCount: GLsizei, count: CValuesRef<GLsizeiVar>?, shaders: CValuesRef<GLuintVar>?): Unit {
    return memScoped {
        val _program = program
        val _maxCount = maxCount
        val _count = count?.getPointer(memScope).rawValue
        val _shaders = shaders?.getPointer(memScope).rawValue
        val res = kni_glGetAttachedShaders(_program, _maxCount, _count, _shaders)
        res
    }
}

@SymbolName("gles2_kni_glGetAttachedShaders")
private external fun kni_glGetAttachedShaders(program: Int, maxCount: Int, count: NativePtr, shaders: NativePtr): Unit

fun glGetAttribLocation(program: GLuint, name: String?): GLint {
    return memScoped {
        val _program = program
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_glGetAttribLocation(_program, _name)
        res
    }
}

@SymbolName("gles2_kni_glGetAttribLocation")
private external fun kni_glGetAttribLocation(program: Int, name: NativePtr): Int

fun glGetBooleanv(pname: GLenum, data: CValuesRef<GLbooleanVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _data = data?.getPointer(memScope).rawValue
        val res = kni_glGetBooleanv(_pname, _data)
        res
    }
}

@SymbolName("gles2_kni_glGetBooleanv")
private external fun kni_glGetBooleanv(pname: Int, data: NativePtr): Unit

fun glGetBufferParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetBufferParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetBufferParameteriv")
private external fun kni_glGetBufferParameteriv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetError(): GLenum {
    val res = kni_glGetError()
    return res
}

@SymbolName("gles2_kni_glGetError")
private external fun kni_glGetError(): Int

fun glGetFloatv(pname: GLenum, data: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _data = data?.getPointer(memScope).rawValue
        val res = kni_glGetFloatv(_pname, _data)
        res
    }
}

@SymbolName("gles2_kni_glGetFloatv")
private external fun kni_glGetFloatv(pname: Int, data: NativePtr): Unit

fun glGetFramebufferAttachmentParameteriv(target: GLenum, attachment: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _attachment = attachment
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetFramebufferAttachmentParameteriv(_target, _attachment, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetFramebufferAttachmentParameteriv")
private external fun kni_glGetFramebufferAttachmentParameteriv(target: Int, attachment: Int, pname: Int, params: NativePtr): Unit

fun glGetIntegerv(pname: GLenum, data: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _pname = pname
        val _data = data?.getPointer(memScope).rawValue
        val res = kni_glGetIntegerv(_pname, _data)
        res
    }
}

@SymbolName("gles2_kni_glGetIntegerv")
private external fun kni_glGetIntegerv(pname: Int, data: NativePtr): Unit

fun glGetProgramiv(program: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _program = program
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetProgramiv(_program, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetProgramiv")
private external fun kni_glGetProgramiv(program: Int, pname: Int, params: NativePtr): Unit

fun glGetProgramInfoLog(program: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, infoLog: CValuesRef<GLcharVar>?): Unit {
    return memScoped {
        val _program = program
        val _bufSize = bufSize
        val _length = length?.getPointer(memScope).rawValue
        val _infoLog = infoLog?.getPointer(memScope).rawValue
        val res = kni_glGetProgramInfoLog(_program, _bufSize, _length, _infoLog)
        res
    }
}

@SymbolName("gles2_kni_glGetProgramInfoLog")
private external fun kni_glGetProgramInfoLog(program: Int, bufSize: Int, length: NativePtr, infoLog: NativePtr): Unit

fun glGetRenderbufferParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetRenderbufferParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetRenderbufferParameteriv")
private external fun kni_glGetRenderbufferParameteriv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetShaderiv(shader: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _shader = shader
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetShaderiv(_shader, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetShaderiv")
private external fun kni_glGetShaderiv(shader: Int, pname: Int, params: NativePtr): Unit

fun glGetShaderInfoLog(shader: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, infoLog: CValuesRef<GLcharVar>?): Unit {
    return memScoped {
        val _shader = shader
        val _bufSize = bufSize
        val _length = length?.getPointer(memScope).rawValue
        val _infoLog = infoLog?.getPointer(memScope).rawValue
        val res = kni_glGetShaderInfoLog(_shader, _bufSize, _length, _infoLog)
        res
    }
}

@SymbolName("gles2_kni_glGetShaderInfoLog")
private external fun kni_glGetShaderInfoLog(shader: Int, bufSize: Int, length: NativePtr, infoLog: NativePtr): Unit

fun glGetShaderPrecisionFormat(shadertype: GLenum, precisiontype: GLenum, range: CValuesRef<GLintVar>?, precision: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _shadertype = shadertype
        val _precisiontype = precisiontype
        val _range = range?.getPointer(memScope).rawValue
        val _precision = precision?.getPointer(memScope).rawValue
        val res = kni_glGetShaderPrecisionFormat(_shadertype, _precisiontype, _range, _precision)
        res
    }
}

@SymbolName("gles2_kni_glGetShaderPrecisionFormat")
private external fun kni_glGetShaderPrecisionFormat(shadertype: Int, precisiontype: Int, range: NativePtr, precision: NativePtr): Unit

fun glGetShaderSource(shader: GLuint, bufSize: GLsizei, length: CValuesRef<GLsizeiVar>?, source: CValuesRef<GLcharVar>?): Unit {
    return memScoped {
        val _shader = shader
        val _bufSize = bufSize
        val _length = length?.getPointer(memScope).rawValue
        val _source = source?.getPointer(memScope).rawValue
        val res = kni_glGetShaderSource(_shader, _bufSize, _length, _source)
        res
    }
}

@SymbolName("gles2_kni_glGetShaderSource")
private external fun kni_glGetShaderSource(shader: Int, bufSize: Int, length: NativePtr, source: NativePtr): Unit

fun glGetString(name: GLenum): CPointer<GLubyteVar>? {
    val _name = name
    val res = kni_glGetString(_name)
    return interpretCPointer<GLubyteVar>(res)
}

@SymbolName("gles2_kni_glGetString")
private external fun kni_glGetString(name: Int): NativePtr

fun glGetTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetTexParameterfv")
private external fun kni_glGetTexParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetTexParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetTexParameteriv")
private external fun kni_glGetTexParameteriv(target: Int, pname: Int, params: NativePtr): Unit

fun glGetUniformfv(program: GLuint, location: GLint, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _program = program
        val _location = location
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetUniformfv(_program, _location, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetUniformfv")
private external fun kni_glGetUniformfv(program: Int, location: Int, params: NativePtr): Unit

fun glGetUniformiv(program: GLuint, location: GLint, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _program = program
        val _location = location
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetUniformiv(_program, _location, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetUniformiv")
private external fun kni_glGetUniformiv(program: Int, location: Int, params: NativePtr): Unit

fun glGetUniformLocation(program: GLuint, name: String?): GLint {
    return memScoped {
        val _program = program
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_glGetUniformLocation(_program, _name)
        res
    }
}

@SymbolName("gles2_kni_glGetUniformLocation")
private external fun kni_glGetUniformLocation(program: Int, name: NativePtr): Int

fun glGetVertexAttribfv(index: GLuint, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _index = index
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetVertexAttribfv(_index, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetVertexAttribfv")
private external fun kni_glGetVertexAttribfv(index: Int, pname: Int, params: NativePtr): Unit

fun glGetVertexAttribiv(index: GLuint, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _index = index
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glGetVertexAttribiv(_index, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glGetVertexAttribiv")
private external fun kni_glGetVertexAttribiv(index: Int, pname: Int, params: NativePtr): Unit

fun glGetVertexAttribPointerv(index: GLuint, pname: GLenum, pointer: CValuesRef<COpaquePointerVar>?): Unit {
    return memScoped {
        val _index = index
        val _pname = pname
        val _pointer = pointer?.getPointer(memScope).rawValue
        val res = kni_glGetVertexAttribPointerv(_index, _pname, _pointer)
        res
    }
}

@SymbolName("gles2_kni_glGetVertexAttribPointerv")
private external fun kni_glGetVertexAttribPointerv(index: Int, pname: Int, pointer: NativePtr): Unit

fun glHint(target: GLenum, mode: GLenum): Unit {
    val _target = target
    val _mode = mode
    val res = kni_glHint(_target, _mode)
    return res
}

@SymbolName("gles2_kni_glHint")
private external fun kni_glHint(target: Int, mode: Int): Unit

fun glIsBuffer(buffer: GLuint): GLboolean {
    val _buffer = buffer
    val res = kni_glIsBuffer(_buffer)
    return res
}

@SymbolName("gles2_kni_glIsBuffer")
private external fun kni_glIsBuffer(buffer: Int): Byte

fun glIsEnabled(cap: GLenum): GLboolean {
    val _cap = cap
    val res = kni_glIsEnabled(_cap)
    return res
}

@SymbolName("gles2_kni_glIsEnabled")
private external fun kni_glIsEnabled(cap: Int): Byte

fun glIsFramebuffer(framebuffer: GLuint): GLboolean {
    val _framebuffer = framebuffer
    val res = kni_glIsFramebuffer(_framebuffer)
    return res
}

@SymbolName("gles2_kni_glIsFramebuffer")
private external fun kni_glIsFramebuffer(framebuffer: Int): Byte

fun glIsProgram(program: GLuint): GLboolean {
    val _program = program
    val res = kni_glIsProgram(_program)
    return res
}

@SymbolName("gles2_kni_glIsProgram")
private external fun kni_glIsProgram(program: Int): Byte

fun glIsRenderbuffer(renderbuffer: GLuint): GLboolean {
    val _renderbuffer = renderbuffer
    val res = kni_glIsRenderbuffer(_renderbuffer)
    return res
}

@SymbolName("gles2_kni_glIsRenderbuffer")
private external fun kni_glIsRenderbuffer(renderbuffer: Int): Byte

fun glIsShader(shader: GLuint): GLboolean {
    val _shader = shader
    val res = kni_glIsShader(_shader)
    return res
}

@SymbolName("gles2_kni_glIsShader")
private external fun kni_glIsShader(shader: Int): Byte

fun glIsTexture(texture: GLuint): GLboolean {
    val _texture = texture
    val res = kni_glIsTexture(_texture)
    return res
}

@SymbolName("gles2_kni_glIsTexture")
private external fun kni_glIsTexture(texture: Int): Byte

fun glLineWidth(width: GLfloat): Unit {
    val _width = width
    val res = kni_glLineWidth(_width)
    return res
}

@SymbolName("gles2_kni_glLineWidth")
private external fun kni_glLineWidth(width: Float): Unit

fun glLinkProgram(program: GLuint): Unit {
    val _program = program
    val res = kni_glLinkProgram(_program)
    return res
}

@SymbolName("gles2_kni_glLinkProgram")
private external fun kni_glLinkProgram(program: Int): Unit

fun glPixelStorei(pname: GLenum, param: GLint): Unit {
    val _pname = pname
    val _param = param
    val res = kni_glPixelStorei(_pname, _param)
    return res
}

@SymbolName("gles2_kni_glPixelStorei")
private external fun kni_glPixelStorei(pname: Int, param: Int): Unit

fun glPolygonOffset(factor: GLfloat, units: GLfloat): Unit {
    val _factor = factor
    val _units = units
    val res = kni_glPolygonOffset(_factor, _units)
    return res
}

@SymbolName("gles2_kni_glPolygonOffset")
private external fun kni_glPolygonOffset(factor: Float, units: Float): Unit

fun glReadPixels(x: GLint, y: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit {
    val _x = x
    val _y = y
    val _width = width
    val _height = height
    val _format = format
    val _type = type
    val _pixels = pixels.rawValue
    val res = kni_glReadPixels(_x, _y, _width, _height, _format, _type, _pixels)
    return res
}

@SymbolName("gles2_kni_glReadPixels")
private external fun kni_glReadPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: NativePtr): Unit

fun glReleaseShaderCompiler(): Unit {
    val res = kni_glReleaseShaderCompiler()
    return res
}

@SymbolName("gles2_kni_glReleaseShaderCompiler")
private external fun kni_glReleaseShaderCompiler(): Unit

fun glRenderbufferStorage(target: GLenum, internalformat: GLenum, width: GLsizei, height: GLsizei): Unit {
    val _target = target
    val _internalformat = internalformat
    val _width = width
    val _height = height
    val res = kni_glRenderbufferStorage(_target, _internalformat, _width, _height)
    return res
}

@SymbolName("gles2_kni_glRenderbufferStorage")
private external fun kni_glRenderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit

fun glSampleCoverage(value: GLfloat, invert: GLboolean): Unit {
    val _value = value
    val _invert = invert
    val res = kni_glSampleCoverage(_value, _invert)
    return res
}

@SymbolName("gles2_kni_glSampleCoverage")
private external fun kni_glSampleCoverage(value: Float, invert: Byte): Unit

fun glScissor(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    val _x = x
    val _y = y
    val _width = width
    val _height = height
    val res = kni_glScissor(_x, _y, _width, _height)
    return res
}

@SymbolName("gles2_kni_glScissor")
private external fun kni_glScissor(x: Int, y: Int, width: Int, height: Int): Unit

fun glShaderBinary(count: GLsizei, shaders: CValuesRef<GLuintVar>?, binaryformat: GLenum, binary: COpaquePointer?, length: GLsizei): Unit {
    return memScoped {
        val _count = count
        val _shaders = shaders?.getPointer(memScope).rawValue
        val _binaryformat = binaryformat
        val _binary = binary.rawValue
        val _length = length
        val res = kni_glShaderBinary(_count, _shaders, _binaryformat, _binary, _length)
        res
    }
}

@SymbolName("gles2_kni_glShaderBinary")
private external fun kni_glShaderBinary(count: Int, shaders: NativePtr, binaryformat: Int, binary: NativePtr, length: Int): Unit

fun glShaderSource(shader: GLuint, count: GLsizei, string: CValuesRef<CPointerVar<GLcharVar>>?, length: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _shader = shader
        val _count = count
        val _string = string?.getPointer(memScope).rawValue
        val _length = length?.getPointer(memScope).rawValue
        val res = kni_glShaderSource(_shader, _count, _string, _length)
        res
    }
}

@SymbolName("gles2_kni_glShaderSource")
private external fun kni_glShaderSource(shader: Int, count: Int, string: NativePtr, length: NativePtr): Unit

fun glStencilFunc(func: GLenum, ref: GLint, mask: GLuint): Unit {
    val _func = func
    val _ref = ref
    val _mask = mask
    val res = kni_glStencilFunc(_func, _ref, _mask)
    return res
}

@SymbolName("gles2_kni_glStencilFunc")
private external fun kni_glStencilFunc(func: Int, ref: Int, mask: Int): Unit

fun glStencilFuncSeparate(face: GLenum, func: GLenum, ref: GLint, mask: GLuint): Unit {
    val _face = face
    val _func = func
    val _ref = ref
    val _mask = mask
    val res = kni_glStencilFuncSeparate(_face, _func, _ref, _mask)
    return res
}

@SymbolName("gles2_kni_glStencilFuncSeparate")
private external fun kni_glStencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit

fun glStencilMask(mask: GLuint): Unit {
    val _mask = mask
    val res = kni_glStencilMask(_mask)
    return res
}

@SymbolName("gles2_kni_glStencilMask")
private external fun kni_glStencilMask(mask: Int): Unit

fun glStencilMaskSeparate(face: GLenum, mask: GLuint): Unit {
    val _face = face
    val _mask = mask
    val res = kni_glStencilMaskSeparate(_face, _mask)
    return res
}

@SymbolName("gles2_kni_glStencilMaskSeparate")
private external fun kni_glStencilMaskSeparate(face: Int, mask: Int): Unit

fun glStencilOp(fail: GLenum, zfail: GLenum, zpass: GLenum): Unit {
    val _fail = fail
    val _zfail = zfail
    val _zpass = zpass
    val res = kni_glStencilOp(_fail, _zfail, _zpass)
    return res
}

@SymbolName("gles2_kni_glStencilOp")
private external fun kni_glStencilOp(fail: Int, zfail: Int, zpass: Int): Unit

fun glStencilOpSeparate(face: GLenum, sfail: GLenum, dpfail: GLenum, dppass: GLenum): Unit {
    val _face = face
    val _sfail = sfail
    val _dpfail = dpfail
    val _dppass = dppass
    val res = kni_glStencilOpSeparate(_face, _sfail, _dpfail, _dppass)
    return res
}

@SymbolName("gles2_kni_glStencilOpSeparate")
private external fun kni_glStencilOpSeparate(face: Int, sfail: Int, dpfail: Int, dppass: Int): Unit

fun glTexImage2D(target: GLenum, level: GLint, internalformat: GLint, width: GLsizei, height: GLsizei, border: GLint, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit {
    val _target = target
    val _level = level
    val _internalformat = internalformat
    val _width = width
    val _height = height
    val _border = border
    val _format = format
    val _type = type
    val _pixels = pixels.rawValue
    val res = kni_glTexImage2D(_target, _level, _internalformat, _width, _height, _border, _format, _type, _pixels)
    return res
}

@SymbolName("gles2_kni_glTexImage2D")
private external fun kni_glTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: NativePtr): Unit

fun glTexParameterf(target: GLenum, pname: GLenum, param: GLfloat): Unit {
    val _target = target
    val _pname = pname
    val _param = param
    val res = kni_glTexParameterf(_target, _pname, _param)
    return res
}

@SymbolName("gles2_kni_glTexParameterf")
private external fun kni_glTexParameterf(target: Int, pname: Int, param: Float): Unit

fun glTexParameterfv(target: GLenum, pname: GLenum, params: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexParameterfv(_target, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glTexParameterfv")
private external fun kni_glTexParameterfv(target: Int, pname: Int, params: NativePtr): Unit

fun glTexParameteri(target: GLenum, pname: GLenum, param: GLint): Unit {
    val _target = target
    val _pname = pname
    val _param = param
    val res = kni_glTexParameteri(_target, _pname, _param)
    return res
}

@SymbolName("gles2_kni_glTexParameteri")
private external fun kni_glTexParameteri(target: Int, pname: Int, param: Int): Unit

fun glTexParameteriv(target: GLenum, pname: GLenum, params: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _target = target
        val _pname = pname
        val _params = params?.getPointer(memScope).rawValue
        val res = kni_glTexParameteriv(_target, _pname, _params)
        res
    }
}

@SymbolName("gles2_kni_glTexParameteriv")
private external fun kni_glTexParameteriv(target: Int, pname: Int, params: NativePtr): Unit

fun glTexSubImage2D(target: GLenum, level: GLint, xoffset: GLint, yoffset: GLint, width: GLsizei, height: GLsizei, format: GLenum, type: GLenum, pixels: COpaquePointer?): Unit {
    val _target = target
    val _level = level
    val _xoffset = xoffset
    val _yoffset = yoffset
    val _width = width
    val _height = height
    val _format = format
    val _type = type
    val _pixels = pixels.rawValue
    val res = kni_glTexSubImage2D(_target, _level, _xoffset, _yoffset, _width, _height, _format, _type, _pixels)
    return res
}

@SymbolName("gles2_kni_glTexSubImage2D")
private external fun kni_glTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: NativePtr): Unit

fun glUniform1f(location: GLint, v0: GLfloat): Unit {
    val _location = location
    val _v0 = v0
    val res = kni_glUniform1f(_location, _v0)
    return res
}

@SymbolName("gles2_kni_glUniform1f")
private external fun kni_glUniform1f(location: Int, v0: Float): Unit

fun glUniform1fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform1fv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform1fv")
private external fun kni_glUniform1fv(location: Int, count: Int, value: NativePtr): Unit

fun glUniform1i(location: GLint, v0: GLint): Unit {
    val _location = location
    val _v0 = v0
    val res = kni_glUniform1i(_location, _v0)
    return res
}

@SymbolName("gles2_kni_glUniform1i")
private external fun kni_glUniform1i(location: Int, v0: Int): Unit

fun glUniform1iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform1iv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform1iv")
private external fun kni_glUniform1iv(location: Int, count: Int, value: NativePtr): Unit

fun glUniform2f(location: GLint, v0: GLfloat, v1: GLfloat): Unit {
    val _location = location
    val _v0 = v0
    val _v1 = v1
    val res = kni_glUniform2f(_location, _v0, _v1)
    return res
}

@SymbolName("gles2_kni_glUniform2f")
private external fun kni_glUniform2f(location: Int, v0: Float, v1: Float): Unit

fun glUniform2fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform2fv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform2fv")
private external fun kni_glUniform2fv(location: Int, count: Int, value: NativePtr): Unit

fun glUniform2i(location: GLint, v0: GLint, v1: GLint): Unit {
    val _location = location
    val _v0 = v0
    val _v1 = v1
    val res = kni_glUniform2i(_location, _v0, _v1)
    return res
}

@SymbolName("gles2_kni_glUniform2i")
private external fun kni_glUniform2i(location: Int, v0: Int, v1: Int): Unit

fun glUniform2iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform2iv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform2iv")
private external fun kni_glUniform2iv(location: Int, count: Int, value: NativePtr): Unit

fun glUniform3f(location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat): Unit {
    val _location = location
    val _v0 = v0
    val _v1 = v1
    val _v2 = v2
    val res = kni_glUniform3f(_location, _v0, _v1, _v2)
    return res
}

@SymbolName("gles2_kni_glUniform3f")
private external fun kni_glUniform3f(location: Int, v0: Float, v1: Float, v2: Float): Unit

fun glUniform3fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform3fv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform3fv")
private external fun kni_glUniform3fv(location: Int, count: Int, value: NativePtr): Unit

fun glUniform3i(location: GLint, v0: GLint, v1: GLint, v2: GLint): Unit {
    val _location = location
    val _v0 = v0
    val _v1 = v1
    val _v2 = v2
    val res = kni_glUniform3i(_location, _v0, _v1, _v2)
    return res
}

@SymbolName("gles2_kni_glUniform3i")
private external fun kni_glUniform3i(location: Int, v0: Int, v1: Int, v2: Int): Unit

fun glUniform3iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform3iv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform3iv")
private external fun kni_glUniform3iv(location: Int, count: Int, value: NativePtr): Unit

fun glUniform4f(location: GLint, v0: GLfloat, v1: GLfloat, v2: GLfloat, v3: GLfloat): Unit {
    val _location = location
    val _v0 = v0
    val _v1 = v1
    val _v2 = v2
    val _v3 = v3
    val res = kni_glUniform4f(_location, _v0, _v1, _v2, _v3)
    return res
}

@SymbolName("gles2_kni_glUniform4f")
private external fun kni_glUniform4f(location: Int, v0: Float, v1: Float, v2: Float, v3: Float): Unit

fun glUniform4fv(location: GLint, count: GLsizei, value: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform4fv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform4fv")
private external fun kni_glUniform4fv(location: Int, count: Int, value: NativePtr): Unit

fun glUniform4i(location: GLint, v0: GLint, v1: GLint, v2: GLint, v3: GLint): Unit {
    val _location = location
    val _v0 = v0
    val _v1 = v1
    val _v2 = v2
    val _v3 = v3
    val res = kni_glUniform4i(_location, _v0, _v1, _v2, _v3)
    return res
}

@SymbolName("gles2_kni_glUniform4i")
private external fun kni_glUniform4i(location: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit

fun glUniform4iv(location: GLint, count: GLsizei, value: CValuesRef<GLintVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniform4iv(_location, _count, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniform4iv")
private external fun kni_glUniform4iv(location: Int, count: Int, value: NativePtr): Unit

fun glUniformMatrix2fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _transpose = transpose
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniformMatrix2fv(_location, _count, _transpose, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniformMatrix2fv")
private external fun kni_glUniformMatrix2fv(location: Int, count: Int, transpose: Byte, value: NativePtr): Unit

fun glUniformMatrix3fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _transpose = transpose
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniformMatrix3fv(_location, _count, _transpose, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniformMatrix3fv")
private external fun kni_glUniformMatrix3fv(location: Int, count: Int, transpose: Byte, value: NativePtr): Unit

fun glUniformMatrix4fv(location: GLint, count: GLsizei, transpose: GLboolean, value: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _location = location
        val _count = count
        val _transpose = transpose
        val _value = value?.getPointer(memScope).rawValue
        val res = kni_glUniformMatrix4fv(_location, _count, _transpose, _value)
        res
    }
}

@SymbolName("gles2_kni_glUniformMatrix4fv")
private external fun kni_glUniformMatrix4fv(location: Int, count: Int, transpose: Byte, value: NativePtr): Unit

fun glUseProgram(program: GLuint): Unit {
    val _program = program
    val res = kni_glUseProgram(_program)
    return res
}

@SymbolName("gles2_kni_glUseProgram")
private external fun kni_glUseProgram(program: Int): Unit

fun glValidateProgram(program: GLuint): Unit {
    val _program = program
    val res = kni_glValidateProgram(_program)
    return res
}

@SymbolName("gles2_kni_glValidateProgram")
private external fun kni_glValidateProgram(program: Int): Unit

fun glVertexAttrib1f(index: GLuint, x: GLfloat): Unit {
    val _index = index
    val _x = x
    val res = kni_glVertexAttrib1f(_index, _x)
    return res
}

@SymbolName("gles2_kni_glVertexAttrib1f")
private external fun kni_glVertexAttrib1f(index: Int, x: Float): Unit

fun glVertexAttrib1fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _index = index
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertexAttrib1fv(_index, _v)
        res
    }
}

@SymbolName("gles2_kni_glVertexAttrib1fv")
private external fun kni_glVertexAttrib1fv(index: Int, v: NativePtr): Unit

fun glVertexAttrib2f(index: GLuint, x: GLfloat, y: GLfloat): Unit {
    val _index = index
    val _x = x
    val _y = y
    val res = kni_glVertexAttrib2f(_index, _x, _y)
    return res
}

@SymbolName("gles2_kni_glVertexAttrib2f")
private external fun kni_glVertexAttrib2f(index: Int, x: Float, y: Float): Unit

fun glVertexAttrib2fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _index = index
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertexAttrib2fv(_index, _v)
        res
    }
}

@SymbolName("gles2_kni_glVertexAttrib2fv")
private external fun kni_glVertexAttrib2fv(index: Int, v: NativePtr): Unit

fun glVertexAttrib3f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat): Unit {
    val _index = index
    val _x = x
    val _y = y
    val _z = z
    val res = kni_glVertexAttrib3f(_index, _x, _y, _z)
    return res
}

@SymbolName("gles2_kni_glVertexAttrib3f")
private external fun kni_glVertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit

fun glVertexAttrib3fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _index = index
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertexAttrib3fv(_index, _v)
        res
    }
}

@SymbolName("gles2_kni_glVertexAttrib3fv")
private external fun kni_glVertexAttrib3fv(index: Int, v: NativePtr): Unit

fun glVertexAttrib4f(index: GLuint, x: GLfloat, y: GLfloat, z: GLfloat, w: GLfloat): Unit {
    val _index = index
    val _x = x
    val _y = y
    val _z = z
    val _w = w
    val res = kni_glVertexAttrib4f(_index, _x, _y, _z, _w)
    return res
}

@SymbolName("gles2_kni_glVertexAttrib4f")
private external fun kni_glVertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit

fun glVertexAttrib4fv(index: GLuint, v: CValuesRef<GLfloatVar>?): Unit {
    return memScoped {
        val _index = index
        val _v = v?.getPointer(memScope).rawValue
        val res = kni_glVertexAttrib4fv(_index, _v)
        res
    }
}

@SymbolName("gles2_kni_glVertexAttrib4fv")
private external fun kni_glVertexAttrib4fv(index: Int, v: NativePtr): Unit

fun glVertexAttribPointer(index: GLuint, size: GLint, type: GLenum, normalized: GLboolean, stride: GLsizei, pointer: COpaquePointer?): Unit {
    val _index = index
    val _size = size
    val _type = type
    val _normalized = normalized
    val _stride = stride
    val _pointer = pointer.rawValue
    val res = kni_glVertexAttribPointer(_index, _size, _type, _normalized, _stride, _pointer)
    return res
}

@SymbolName("gles2_kni_glVertexAttribPointer")
private external fun kni_glVertexAttribPointer(index: Int, size: Int, type: Int, normalized: Byte, stride: Int, pointer: NativePtr): Unit

fun glViewport(x: GLint, y: GLint, width: GLsizei, height: GLsizei): Unit {
    val _x = x
    val _y = y
    val _width = width
    val _height = height
    val res = kni_glViewport(_x, _y, _width, _height)
    return res
}

@SymbolName("gles2_kni_glViewport")
private external fun kni_glViewport(x: Int, y: Int, width: Int, height: Int): Unit

val __gl2_h_: Int = 1

val _STDINT_H: Int = 1

val _FEATURES_H: Int = 1

val _DEFAULT_SOURCE: Int = 1

val __USE_ISOC11: Int = 1

val __USE_ISOC99: Int = 1

val __USE_ISOC95: Int = 1

val __USE_POSIX_IMPLICITLY: Int = 1

val _POSIX_SOURCE: Int = 1

val _POSIX_C_SOURCE: Long = 200809

val __USE_POSIX: Int = 1

val __USE_POSIX2: Int = 1

val __USE_POSIX199309: Int = 1

val __USE_POSIX199506: Int = 1

val __USE_XOPEN2K: Int = 1

val __USE_XOPEN2K8: Int = 1

val _ATFILE_SOURCE: Int = 1

val __USE_MISC: Int = 1

val __USE_ATFILE: Int = 1

val __USE_FORTIFY_LEVEL: Int = 0

val _STDC_PREDEF_H: Int = 1

val __STDC_IEC_559__: Int = 1

val __STDC_IEC_559_COMPLEX__: Int = 1

val __STDC_ISO_10646__: Long = 201505

val __STDC_NO_THREADS__: Int = 1

val __GNU_LIBRARY__: Int = 6

val __GLIBC__: Int = 2

val __GLIBC_MINOR__: Int = 23

val _SYS_CDEFS_H: Int = 1

val __WORDSIZE: Int = 64

val __WORDSIZE_TIME64_COMPAT32: Int = 1

val __SYSCALL_WORDSIZE: Int = 64

val _BITS_WCHAR_H: Int = 1

val __WCHAR_MAX: Int = 2147483647

val __WCHAR_MIN: Int = -2147483648

val INT8_MIN: Int = -128

val INT16_MIN: Int = -32768

val INT32_MIN: Int = -2147483648

val INT64_MIN: Long = -9223372036854775807 - 1

val INT8_MAX: Int = 127

val INT16_MAX: Int = 32767

val INT32_MAX: Int = 2147483647

val INT64_MAX: Long = 9223372036854775807

val UINT8_MAX: Int = 255

val UINT16_MAX: Int = 65535

val UINT32_MAX: Int = -1

val UINT64_MAX: Long = -1

val INT_LEAST8_MIN: Int = -128

val INT_LEAST16_MIN: Int = -32768

val INT_LEAST32_MIN: Int = -2147483648

val INT_LEAST64_MIN: Long = -9223372036854775807 - 1

val INT_LEAST8_MAX: Int = 127

val INT_LEAST16_MAX: Int = 32767

val INT_LEAST32_MAX: Int = 2147483647

val INT_LEAST64_MAX: Long = 9223372036854775807

val UINT_LEAST8_MAX: Int = 255

val UINT_LEAST16_MAX: Int = 65535

val UINT_LEAST32_MAX: Int = -1

val UINT_LEAST64_MAX: Long = -1

val INT_FAST8_MIN: Int = -128

val INT_FAST16_MIN: Long = -9223372036854775807 - 1

val INT_FAST32_MIN: Long = -9223372036854775807 - 1

val INT_FAST64_MIN: Long = -9223372036854775807 - 1

val INT_FAST8_MAX: Int = 127

val INT_FAST16_MAX: Long = 9223372036854775807

val INT_FAST32_MAX: Long = 9223372036854775807

val INT_FAST64_MAX: Long = 9223372036854775807

val UINT_FAST8_MAX: Int = 255

val UINT_FAST16_MAX: Long = -1

val UINT_FAST32_MAX: Long = -1

val UINT_FAST64_MAX: Long = -1

val INTPTR_MIN: Long = -9223372036854775807 - 1

val INTPTR_MAX: Long = 9223372036854775807

val UINTPTR_MAX: Long = -1

val INTMAX_MIN: Long = -9223372036854775807 - 1

val INTMAX_MAX: Long = 9223372036854775807

val UINTMAX_MAX: Long = -1

val PTRDIFF_MIN: Long = -9223372036854775807 - 1

val PTRDIFF_MAX: Long = 9223372036854775807

val SIG_ATOMIC_MIN: Int = -2147483648

val SIG_ATOMIC_MAX: Int = 2147483647

val SIZE_MAX: Long = -1

val WCHAR_MIN: Int = -2147483648

val WCHAR_MAX: Int = 2147483647

val WINT_MIN: Int = 0

val WINT_MAX: Int = -1

val KHRONOS_SUPPORT_INT64: Int = 1

val KHRONOS_SUPPORT_FLOAT: Int = 1

val KHRONOS_MAX_ENUM: Int = 2147483647

val GL_ES_VERSION_2_0: Int = 1

val GL_DEPTH_BUFFER_BIT: Int = 256

val GL_STENCIL_BUFFER_BIT: Int = 1024

val GL_COLOR_BUFFER_BIT: Int = 16384

val GL_FALSE: Int = 0

val GL_TRUE: Int = 1

val GL_POINTS: Int = 0

val GL_LINES: Int = 1

val GL_LINE_LOOP: Int = 2

val GL_LINE_STRIP: Int = 3

val GL_TRIANGLES: Int = 4

val GL_TRIANGLE_STRIP: Int = 5

val GL_TRIANGLE_FAN: Int = 6

val GL_ZERO: Int = 0

val GL_ONE: Int = 1

val GL_SRC_COLOR: Int = 768

val GL_ONE_MINUS_SRC_COLOR: Int = 769

val GL_SRC_ALPHA: Int = 770

val GL_ONE_MINUS_SRC_ALPHA: Int = 771

val GL_DST_ALPHA: Int = 772

val GL_ONE_MINUS_DST_ALPHA: Int = 773

val GL_DST_COLOR: Int = 774

val GL_ONE_MINUS_DST_COLOR: Int = 775

val GL_SRC_ALPHA_SATURATE: Int = 776

val GL_FUNC_ADD: Int = 32774

val GL_BLEND_EQUATION: Int = 32777

val GL_BLEND_EQUATION_RGB: Int = 32777

val GL_BLEND_EQUATION_ALPHA: Int = 34877

val GL_FUNC_SUBTRACT: Int = 32778

val GL_FUNC_REVERSE_SUBTRACT: Int = 32779

val GL_BLEND_DST_RGB: Int = 32968

val GL_BLEND_SRC_RGB: Int = 32969

val GL_BLEND_DST_ALPHA: Int = 32970

val GL_BLEND_SRC_ALPHA: Int = 32971

val GL_CONSTANT_COLOR: Int = 32769

val GL_ONE_MINUS_CONSTANT_COLOR: Int = 32770

val GL_CONSTANT_ALPHA: Int = 32771

val GL_ONE_MINUS_CONSTANT_ALPHA: Int = 32772

val GL_BLEND_COLOR: Int = 32773

val GL_ARRAY_BUFFER: Int = 34962

val GL_ELEMENT_ARRAY_BUFFER: Int = 34963

val GL_ARRAY_BUFFER_BINDING: Int = 34964

val GL_ELEMENT_ARRAY_BUFFER_BINDING: Int = 34965

val GL_STREAM_DRAW: Int = 35040

val GL_STATIC_DRAW: Int = 35044

val GL_DYNAMIC_DRAW: Int = 35048

val GL_BUFFER_SIZE: Int = 34660

val GL_BUFFER_USAGE: Int = 34661

val GL_CURRENT_VERTEX_ATTRIB: Int = 34342

val GL_FRONT: Int = 1028

val GL_BACK: Int = 1029

val GL_FRONT_AND_BACK: Int = 1032

val GL_TEXTURE_2D: Int = 3553

val GL_CULL_FACE: Int = 2884

val GL_BLEND: Int = 3042

val GL_DITHER: Int = 3024

val GL_STENCIL_TEST: Int = 2960

val GL_DEPTH_TEST: Int = 2929

val GL_SCISSOR_TEST: Int = 3089

val GL_POLYGON_OFFSET_FILL: Int = 32823

val GL_SAMPLE_ALPHA_TO_COVERAGE: Int = 32926

val GL_SAMPLE_COVERAGE: Int = 32928

val GL_NO_ERROR: Int = 0

val GL_INVALID_ENUM: Int = 1280

val GL_INVALID_VALUE: Int = 1281

val GL_INVALID_OPERATION: Int = 1282

val GL_OUT_OF_MEMORY: Int = 1285

val GL_CW: Int = 2304

val GL_CCW: Int = 2305

val GL_LINE_WIDTH: Int = 2849

val GL_ALIASED_POINT_SIZE_RANGE: Int = 33901

val GL_ALIASED_LINE_WIDTH_RANGE: Int = 33902

val GL_CULL_FACE_MODE: Int = 2885

val GL_FRONT_FACE: Int = 2886

val GL_DEPTH_RANGE: Int = 2928

val GL_DEPTH_WRITEMASK: Int = 2930

val GL_DEPTH_CLEAR_VALUE: Int = 2931

val GL_DEPTH_FUNC: Int = 2932

val GL_STENCIL_CLEAR_VALUE: Int = 2961

val GL_STENCIL_FUNC: Int = 2962

val GL_STENCIL_FAIL: Int = 2964

val GL_STENCIL_PASS_DEPTH_FAIL: Int = 2965

val GL_STENCIL_PASS_DEPTH_PASS: Int = 2966

val GL_STENCIL_REF: Int = 2967

val GL_STENCIL_VALUE_MASK: Int = 2963

val GL_STENCIL_WRITEMASK: Int = 2968

val GL_STENCIL_BACK_FUNC: Int = 34816

val GL_STENCIL_BACK_FAIL: Int = 34817

val GL_STENCIL_BACK_PASS_DEPTH_FAIL: Int = 34818

val GL_STENCIL_BACK_PASS_DEPTH_PASS: Int = 34819

val GL_STENCIL_BACK_REF: Int = 36003

val GL_STENCIL_BACK_VALUE_MASK: Int = 36004

val GL_STENCIL_BACK_WRITEMASK: Int = 36005

val GL_VIEWPORT: Int = 2978

val GL_SCISSOR_BOX: Int = 3088

val GL_COLOR_CLEAR_VALUE: Int = 3106

val GL_COLOR_WRITEMASK: Int = 3107

val GL_UNPACK_ALIGNMENT: Int = 3317

val GL_PACK_ALIGNMENT: Int = 3333

val GL_MAX_TEXTURE_SIZE: Int = 3379

val GL_MAX_VIEWPORT_DIMS: Int = 3386

val GL_SUBPIXEL_BITS: Int = 3408

val GL_RED_BITS: Int = 3410

val GL_GREEN_BITS: Int = 3411

val GL_BLUE_BITS: Int = 3412

val GL_ALPHA_BITS: Int = 3413

val GL_DEPTH_BITS: Int = 3414

val GL_STENCIL_BITS: Int = 3415

val GL_POLYGON_OFFSET_UNITS: Int = 10752

val GL_POLYGON_OFFSET_FACTOR: Int = 32824

val GL_TEXTURE_BINDING_2D: Int = 32873

val GL_SAMPLE_BUFFERS: Int = 32936

val GL_SAMPLES: Int = 32937

val GL_SAMPLE_COVERAGE_VALUE: Int = 32938

val GL_SAMPLE_COVERAGE_INVERT: Int = 32939

val GL_NUM_COMPRESSED_TEXTURE_FORMATS: Int = 34466

val GL_COMPRESSED_TEXTURE_FORMATS: Int = 34467

val GL_DONT_CARE: Int = 4352

val GL_FASTEST: Int = 4353

val GL_NICEST: Int = 4354

val GL_GENERATE_MIPMAP_HINT: Int = 33170

val GL_BYTE: Int = 5120

val GL_UNSIGNED_BYTE: Int = 5121

val GL_SHORT: Int = 5122

val GL_UNSIGNED_SHORT: Int = 5123

val GL_INT: Int = 5124

val GL_UNSIGNED_INT: Int = 5125

val GL_FLOAT: Int = 5126

val GL_FIXED: Int = 5132

val GL_DEPTH_COMPONENT: Int = 6402

val GL_ALPHA: Int = 6406

val GL_RGB: Int = 6407

val GL_RGBA: Int = 6408

val GL_LUMINANCE: Int = 6409

val GL_LUMINANCE_ALPHA: Int = 6410

val GL_UNSIGNED_SHORT_4_4_4_4: Int = 32819

val GL_UNSIGNED_SHORT_5_5_5_1: Int = 32820

val GL_UNSIGNED_SHORT_5_6_5: Int = 33635

val GL_FRAGMENT_SHADER: Int = 35632

val GL_VERTEX_SHADER: Int = 35633

val GL_MAX_VERTEX_ATTRIBS: Int = 34921

val GL_MAX_VERTEX_UNIFORM_VECTORS: Int = 36347

val GL_MAX_VARYING_VECTORS: Int = 36348

val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = 35661

val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = 35660

val GL_MAX_TEXTURE_IMAGE_UNITS: Int = 34930

val GL_MAX_FRAGMENT_UNIFORM_VECTORS: Int = 36349

val GL_SHADER_TYPE: Int = 35663

val GL_DELETE_STATUS: Int = 35712

val GL_LINK_STATUS: Int = 35714

val GL_VALIDATE_STATUS: Int = 35715

val GL_ATTACHED_SHADERS: Int = 35717

val GL_ACTIVE_UNIFORMS: Int = 35718

val GL_ACTIVE_UNIFORM_MAX_LENGTH: Int = 35719

val GL_ACTIVE_ATTRIBUTES: Int = 35721

val GL_ACTIVE_ATTRIBUTE_MAX_LENGTH: Int = 35722

val GL_SHADING_LANGUAGE_VERSION: Int = 35724

val GL_CURRENT_PROGRAM: Int = 35725

val GL_NEVER: Int = 512

val GL_LESS: Int = 513

val GL_EQUAL: Int = 514

val GL_LEQUAL: Int = 515

val GL_GREATER: Int = 516

val GL_NOTEQUAL: Int = 517

val GL_GEQUAL: Int = 518

val GL_ALWAYS: Int = 519

val GL_KEEP: Int = 7680

val GL_REPLACE: Int = 7681

val GL_INCR: Int = 7682

val GL_DECR: Int = 7683

val GL_INVERT: Int = 5386

val GL_INCR_WRAP: Int = 34055

val GL_DECR_WRAP: Int = 34056

val GL_VENDOR: Int = 7936

val GL_RENDERER: Int = 7937

val GL_VERSION: Int = 7938

val GL_EXTENSIONS: Int = 7939

val GL_NEAREST: Int = 9728

val GL_LINEAR: Int = 9729

val GL_NEAREST_MIPMAP_NEAREST: Int = 9984

val GL_LINEAR_MIPMAP_NEAREST: Int = 9985

val GL_NEAREST_MIPMAP_LINEAR: Int = 9986

val GL_LINEAR_MIPMAP_LINEAR: Int = 9987

val GL_TEXTURE_MAG_FILTER: Int = 10240

val GL_TEXTURE_MIN_FILTER: Int = 10241

val GL_TEXTURE_WRAP_S: Int = 10242

val GL_TEXTURE_WRAP_T: Int = 10243

val GL_TEXTURE: Int = 5890

val GL_TEXTURE_CUBE_MAP: Int = 34067

val GL_TEXTURE_BINDING_CUBE_MAP: Int = 34068

val GL_TEXTURE_CUBE_MAP_POSITIVE_X: Int = 34069

val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: Int = 34070

val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: Int = 34071

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = 34072

val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: Int = 34073

val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = 34074

val GL_MAX_CUBE_MAP_TEXTURE_SIZE: Int = 34076

val GL_TEXTURE0: Int = 33984

val GL_TEXTURE1: Int = 33985

val GL_TEXTURE2: Int = 33986

val GL_TEXTURE3: Int = 33987

val GL_TEXTURE4: Int = 33988

val GL_TEXTURE5: Int = 33989

val GL_TEXTURE6: Int = 33990

val GL_TEXTURE7: Int = 33991

val GL_TEXTURE8: Int = 33992

val GL_TEXTURE9: Int = 33993

val GL_TEXTURE10: Int = 33994

val GL_TEXTURE11: Int = 33995

val GL_TEXTURE12: Int = 33996

val GL_TEXTURE13: Int = 33997

val GL_TEXTURE14: Int = 33998

val GL_TEXTURE15: Int = 33999

val GL_TEXTURE16: Int = 34000

val GL_TEXTURE17: Int = 34001

val GL_TEXTURE18: Int = 34002

val GL_TEXTURE19: Int = 34003

val GL_TEXTURE20: Int = 34004

val GL_TEXTURE21: Int = 34005

val GL_TEXTURE22: Int = 34006

val GL_TEXTURE23: Int = 34007

val GL_TEXTURE24: Int = 34008

val GL_TEXTURE25: Int = 34009

val GL_TEXTURE26: Int = 34010

val GL_TEXTURE27: Int = 34011

val GL_TEXTURE28: Int = 34012

val GL_TEXTURE29: Int = 34013

val GL_TEXTURE30: Int = 34014

val GL_TEXTURE31: Int = 34015

val GL_ACTIVE_TEXTURE: Int = 34016

val GL_REPEAT: Int = 10497

val GL_CLAMP_TO_EDGE: Int = 33071

val GL_MIRRORED_REPEAT: Int = 33648

val GL_FLOAT_VEC2: Int = 35664

val GL_FLOAT_VEC3: Int = 35665

val GL_FLOAT_VEC4: Int = 35666

val GL_INT_VEC2: Int = 35667

val GL_INT_VEC3: Int = 35668

val GL_INT_VEC4: Int = 35669

val GL_BOOL: Int = 35670

val GL_BOOL_VEC2: Int = 35671

val GL_BOOL_VEC3: Int = 35672

val GL_BOOL_VEC4: Int = 35673

val GL_FLOAT_MAT2: Int = 35674

val GL_FLOAT_MAT3: Int = 35675

val GL_FLOAT_MAT4: Int = 35676

val GL_SAMPLER_2D: Int = 35678

val GL_SAMPLER_CUBE: Int = 35680

val GL_VERTEX_ATTRIB_ARRAY_ENABLED: Int = 34338

val GL_VERTEX_ATTRIB_ARRAY_SIZE: Int = 34339

val GL_VERTEX_ATTRIB_ARRAY_STRIDE: Int = 34340

val GL_VERTEX_ATTRIB_ARRAY_TYPE: Int = 34341

val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = 34922

val GL_VERTEX_ATTRIB_ARRAY_POINTER: Int = 34373

val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = 34975

val GL_IMPLEMENTATION_COLOR_READ_TYPE: Int = 35738

val GL_IMPLEMENTATION_COLOR_READ_FORMAT: Int = 35739

val GL_COMPILE_STATUS: Int = 35713

val GL_INFO_LOG_LENGTH: Int = 35716

val GL_SHADER_SOURCE_LENGTH: Int = 35720

val GL_SHADER_COMPILER: Int = 36346

val GL_SHADER_BINARY_FORMATS: Int = 36344

val GL_NUM_SHADER_BINARY_FORMATS: Int = 36345

val GL_LOW_FLOAT: Int = 36336

val GL_MEDIUM_FLOAT: Int = 36337

val GL_HIGH_FLOAT: Int = 36338

val GL_LOW_INT: Int = 36339

val GL_MEDIUM_INT: Int = 36340

val GL_HIGH_INT: Int = 36341

val GL_FRAMEBUFFER: Int = 36160

val GL_RENDERBUFFER: Int = 36161

val GL_RGBA4: Int = 32854

val GL_RGB5_A1: Int = 32855

val GL_RGB565: Int = 36194

val GL_DEPTH_COMPONENT16: Int = 33189

val GL_STENCIL_INDEX8: Int = 36168

val GL_RENDERBUFFER_WIDTH: Int = 36162

val GL_RENDERBUFFER_HEIGHT: Int = 36163

val GL_RENDERBUFFER_INTERNAL_FORMAT: Int = 36164

val GL_RENDERBUFFER_RED_SIZE: Int = 36176

val GL_RENDERBUFFER_GREEN_SIZE: Int = 36177

val GL_RENDERBUFFER_BLUE_SIZE: Int = 36178

val GL_RENDERBUFFER_ALPHA_SIZE: Int = 36179

val GL_RENDERBUFFER_DEPTH_SIZE: Int = 36180

val GL_RENDERBUFFER_STENCIL_SIZE: Int = 36181

val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int = 36048

val GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int = 36049

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int = 36050

val GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int = 36051

val GL_COLOR_ATTACHMENT0: Int = 36064

val GL_DEPTH_ATTACHMENT: Int = 36096

val GL_STENCIL_ATTACHMENT: Int = 36128

val GL_NONE: Int = 0

val GL_FRAMEBUFFER_COMPLETE: Int = 36053

val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = 36054

val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = 36055

val GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int = 36057

val GL_FRAMEBUFFER_UNSUPPORTED: Int = 36061

val GL_FRAMEBUFFER_BINDING: Int = 36006

val GL_RENDERBUFFER_BINDING: Int = 36007

val GL_MAX_RENDERBUFFER_SIZE: Int = 34024

val GL_INVALID_FRAMEBUFFER_OPERATION: Int = 1286

class __GLsync(override val rawPtr: NativePtr) : COpaque

typealias khronos_boolean_enum_tVar = IntVarOf<khronos_boolean_enum_t>
typealias khronos_boolean_enum_t = Int

val KHRONOS_FALSE: khronos_boolean_enum_t = 0
val KHRONOS_TRUE: khronos_boolean_enum_t = 1
val KHRONOS_BOOLEAN_ENUM_FORCE_SIZE: khronos_boolean_enum_t = 2147483647

typealias int8_tVar = ByteVarOf<int8_t>
typealias int8_t = Byte

typealias int16_tVar = ShortVarOf<int16_t>
typealias int16_t = Short

typealias int32_tVar = IntVarOf<int32_t>
typealias int32_t = Int

typealias int64_tVar = LongVarOf<int64_t>
typealias int64_t = Long

typealias uint8_tVar = ByteVarOf<uint8_t>
typealias uint8_t = Byte

typealias uint16_tVar = ShortVarOf<uint16_t>
typealias uint16_t = Short

typealias uint32_tVar = IntVarOf<uint32_t>
typealias uint32_t = Int

typealias uint64_tVar = LongVarOf<uint64_t>
typealias uint64_t = Long

typealias int_least8_tVar = ByteVarOf<int_least8_t>
typealias int_least8_t = Byte

typealias int_least16_tVar = ShortVarOf<int_least16_t>
typealias int_least16_t = Short

typealias int_least32_tVar = IntVarOf<int_least32_t>
typealias int_least32_t = Int

typealias int_least64_tVar = LongVarOf<int_least64_t>
typealias int_least64_t = Long

typealias uint_least8_tVar = ByteVarOf<uint_least8_t>
typealias uint_least8_t = Byte

typealias uint_least16_tVar = ShortVarOf<uint_least16_t>
typealias uint_least16_t = Short

typealias uint_least32_tVar = IntVarOf<uint_least32_t>
typealias uint_least32_t = Int

typealias uint_least64_tVar = LongVarOf<uint_least64_t>
typealias uint_least64_t = Long

typealias int_fast8_tVar = ByteVarOf<int_fast8_t>
typealias int_fast8_t = Byte

typealias int_fast16_tVar = LongVarOf<int_fast16_t>
typealias int_fast16_t = Long

typealias int_fast32_tVar = LongVarOf<int_fast32_t>
typealias int_fast32_t = Long

typealias int_fast64_tVar = LongVarOf<int_fast64_t>
typealias int_fast64_t = Long

typealias uint_fast8_tVar = ByteVarOf<uint_fast8_t>
typealias uint_fast8_t = Byte

typealias uint_fast16_tVar = LongVarOf<uint_fast16_t>
typealias uint_fast16_t = Long

typealias uint_fast32_tVar = LongVarOf<uint_fast32_t>
typealias uint_fast32_t = Long

typealias uint_fast64_tVar = LongVarOf<uint_fast64_t>
typealias uint_fast64_t = Long

typealias intptr_tVar = LongVarOf<intptr_t>
typealias intptr_t = Long

typealias uintptr_tVar = LongVarOf<uintptr_t>
typealias uintptr_t = Long

typealias intmax_tVar = LongVarOf<intmax_t>
typealias intmax_t = Long

typealias uintmax_tVar = LongVarOf<uintmax_t>
typealias uintmax_t = Long

typealias khronos_int32_tVar = IntVarOf<khronos_int32_t>
typealias khronos_int32_t = int32_t

typealias khronos_uint32_tVar = IntVarOf<khronos_uint32_t>
typealias khronos_uint32_t = uint32_t

typealias khronos_int64_tVar = LongVarOf<khronos_int64_t>
typealias khronos_int64_t = int64_t

typealias khronos_uint64_tVar = LongVarOf<khronos_uint64_t>
typealias khronos_uint64_t = uint64_t

typealias khronos_int8_tVar = ByteVarOf<khronos_int8_t>
typealias khronos_int8_t = Byte

typealias khronos_uint8_tVar = ByteVarOf<khronos_uint8_t>
typealias khronos_uint8_t = Byte

typealias khronos_int16_tVar = ShortVarOf<khronos_int16_t>
typealias khronos_int16_t = Short

typealias khronos_uint16_tVar = ShortVarOf<khronos_uint16_t>
typealias khronos_uint16_t = Short

typealias khronos_intptr_tVar = LongVarOf<khronos_intptr_t>
typealias khronos_intptr_t = Long

typealias khronos_uintptr_tVar = LongVarOf<khronos_uintptr_t>
typealias khronos_uintptr_t = Long

typealias khronos_ssize_tVar = LongVarOf<khronos_ssize_t>
typealias khronos_ssize_t = Long

typealias khronos_usize_tVar = LongVarOf<khronos_usize_t>
typealias khronos_usize_t = Long

typealias khronos_float_tVar = FloatVarOf<khronos_float_t>
typealias khronos_float_t = Float

typealias khronos_utime_nanoseconds_tVar = LongVarOf<khronos_utime_nanoseconds_t>
typealias khronos_utime_nanoseconds_t = khronos_uint64_t

typealias khronos_stime_nanoseconds_tVar = LongVarOf<khronos_stime_nanoseconds_t>
typealias khronos_stime_nanoseconds_t = khronos_int64_t

typealias GLbyteVar = ByteVarOf<GLbyte>
typealias GLbyte = khronos_int8_t

typealias GLclampfVar = FloatVarOf<GLclampf>
typealias GLclampf = khronos_float_t

typealias GLfixedVar = IntVarOf<GLfixed>
typealias GLfixed = khronos_int32_t

typealias GLshortVar = ShortVarOf<GLshort>
typealias GLshort = Short

typealias GLushortVar = ShortVarOf<GLushort>
typealias GLushort = Short

typealias GLsyncVar = CPointerVarOf<GLsync>
typealias GLsync = CPointer<__GLsync>

typealias GLint64Var = LongVarOf<GLint64>
typealias GLint64 = khronos_int64_t

typealias GLuint64Var = LongVarOf<GLuint64>
typealias GLuint64 = khronos_uint64_t

typealias GLenumVar = IntVarOf<GLenum>
typealias GLenum = Int

typealias GLuintVar = IntVarOf<GLuint>
typealias GLuint = Int

typealias GLcharVar = ByteVarOf<GLchar>
typealias GLchar = Byte

typealias GLfloatVar = FloatVarOf<GLfloat>
typealias GLfloat = khronos_float_t

typealias GLsizeiptrVar = LongVarOf<GLsizeiptr>
typealias GLsizeiptr = khronos_ssize_t

typealias GLintptrVar = LongVarOf<GLintptr>
typealias GLintptr = khronos_intptr_t

typealias GLbitfieldVar = IntVarOf<GLbitfield>
typealias GLbitfield = Int

typealias GLintVar = IntVarOf<GLint>
typealias GLint = Int

typealias GLbooleanVar = ByteVarOf<GLboolean>
typealias GLboolean = Byte

typealias GLsizeiVar = IntVarOf<GLsizei>
typealias GLsizei = Int

typealias GLubyteVar = ByteVarOf<GLubyte>
typealias GLubyte = khronos_uint8_t

