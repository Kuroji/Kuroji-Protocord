/*import com.google.protobuf.Any
import xyz.usbpc.kuroji.proto.discord.events.*
import xyz.usbpc.kuroji.proto.discord.objects.*

fun main(args: Array<String>) {
    val testUser = UserOuterClass.User.newBuilder().setId(1234).build()
    println(Any.pack(testUser).typeUrl)
    println(UserOuterClass.User.getDescriptor().fullName)
}

fun getMessage(eventType: Event.EventType, message: Any) {
    when (eventType) {
        Event.EventType.READY -> ReadyEventOuterClass.ReadyEvent.parseFrom(message.value)
        Event.EventType.CHANNEL_CREATE -> ChannelOuterClass.Channel.parseFrom(message.value)
        Event.EventType.CHANNEL_UPDATE -> ChannelOuterClass.Channel.parseFrom(message.value)
        Event.EventType.CHANNEL_DELETE -> ChannelOuterClass.Channel.parseFrom(message.value)
        Event.EventType.CHANNEL_PINS_UPDATE -> ChannelPinsUpdateEventOuterClass.ChannelPinsUpdateEvent.parseFrom(message.value)
        Event.EventType.GUILD_CREATE -> GuildOuterClass.Guild.parseFrom(message.value)
        Event.EventType.GUILD_UPDATE -> GuildOuterClass.Guild.parseFrom(message.value)
        Event.EventType.GUILD_DELETE -> GuildOuterClass.Guild.parseFrom(message.value)
        Event.EventType.GUILD_BAN_ADD -> GuildBanEventOuterClass.GuildBanEvent.parseFrom(message.value)
        Event.EventType.GUILD_BAN_REMOVE -> GuildBanEventOuterClass.GuildBanEvent.parseFrom(message.value)
        Event.EventType.GUILD_EMOJIS_UPDATE -> GuildEmojisUpdateEventOuterClass.GuildEmojisUpdateEvent.parseFrom(message.value)
        Event.EventType.GUILD_INTEGRATIONS_UPDATE -> GuildIntegrationsUpdateEventOuterClass.GuildIntegrationsUpdateEvent.parseFrom(message.value)
        Event.EventType.GUILD_MEMBER_ADD -> GuildOuterClass.Guild.Member.parseFrom(message.value)
        Event.EventType.GUILD_MEMBER_REMOVE -> GuildMemberRemoveEventOuterClass.GuildMemberRemoveEvent.parseFrom(message.value)
        Event.EventType.GUILD_MEMBER_UPDATE -> GuildMemberUpdateEventOuterClass.GuildMemberUpdateEvent.parseFrom(message.value)
        Event.EventType.GUILD_MEMBERS_CHUNCK -> GuildMembersChunkEventOuterClass.GuildMembersChunkEvent.parseFrom(message.value)
        Event.EventType.GUILD_ROLE_CREATE -> GuildRoleEventOuterClass.GuildRoleEvent.parseFrom(message.value)
        Event.EventType.GUILD_ROLE_UPDATE -> GuildRoleEventOuterClass.GuildRoleEvent.parseFrom(message.value)
        Event.EventType.GUILD_ROLE_DELETE -> GuildRoleDeleteEventOuterClass.GuildRoleDeleteEvent.parseFrom(message.value)
        Event.EventType.MESSAGE_CREATE -> MessageOuterClass.Message.parseFrom(message.value)
        Event.EventType.MESSAGE_UPDATE -> MessageOuterClass.Message.parseFrom(message.value)
        Event.EventType.MESSAGE_DELETE -> MessageDeleteEventOuterClass.MessageDeleteEvent.parseFrom(message.value)
        Event.EventType.MESSAGE_DELETE_BULK -> MessageDeleteBulkEventOuterClass.MessageDeleteBulkEvent.parseFrom(message.value)
        Event.EventType.MESSAGE_REACTION_ADD -> MessageReactionEventOuterClass.MessageReactionEvent.parseFrom(message.value)
        Event.EventType.MESSAGE_REACTION_REMOVE -> MessageReactionEventOuterClass.MessageReactionEvent.parseFrom(message.value)
        Event.EventType.MESSAGE_REACTION_REMOVE_ALL -> MessageReactionEventOuterClass.MessageReactionEvent.parseFrom(message.value)
        Event.EventType.PRESENCE_UPDATE -> PresenceUpdateOuterClass.PresenceUpdate.parseFrom(message.value)
        Event.EventType.TYPING_START -> TypingStartEventOuterClass.TypingStartEvent.parseFrom(message.value)
        Event.EventType.USER_UPDATE -> UserOuterClass.User.parseFrom(message.value)
        Event.EventType.VOICE_STATE_UPDATE -> VoiceStateOuterClass.VoiceState.parseFrom(message.value)
        Event.EventType.VOICE_SERVER_UPDATE -> VoiceServerUpdateEventOuterClass.VoiceServerUpdateEvent.parseFrom(message.value)
        Event.EventType.WEBHOOKS_UPDATE -> WebhooksUpdateEventOuterClass.WebhooksUpdateEvent.parseFrom(message.value)
        Event.EventType.UNRECOGNIZED -> TODO()
        Event.EventType.UNKNOWN -> TODO()
    }
}*/