package org.apache.rocketmq.example.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyServer {


    public static void main(String[] args) throws InterruptedException {

        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup();

        ServerBootstrap serverBootstrap = new ServerBootstrap();

        serverBootstrap.group(boss, worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new DemoInbound());

        ChannelFuture sync = serverBootstrap.bind(8888).sync();

        sync.channel().closeFuture().sync();

    }

    private static class DemoInbound extends SimpleChannelInboundHandler {
        @Override
        protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
            System.out.println(" msg receive ...");
            ctx.channel().writeAndFlush(" server time : " + LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
        }


        @Override
        public void channelActive(ChannelHandlerContext ctx) throws Exception {
            System.out.println("xxxxxxxxx active ");
        }


        @Override
        public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
            System.out.println(" channel reg .... ");
        }
    }


}
